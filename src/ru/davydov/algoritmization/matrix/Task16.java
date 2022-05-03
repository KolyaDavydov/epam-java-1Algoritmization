package ru.davydov.algoritmization.matrix;

/*

Магическим квадратом порядка  n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, 
..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между 
собой. Построить такой квадрат
 
 
 
 В зависимости от порядка матрицы методы построения магического квадрата
разделяются на три:

1) для матрицы нечетного порядка (3, 5, 7 и т.д) использовался сиамский метод.
Построение начинается по порядку от 1 с верхней строки и среднего ряда.
Строится по диагонали вправо и вверх.
Если выходим за пределы матрицы сверху то продолжаем с нижней строки следующего ряда.
Если выходим за пределы справа, то продолжаем с левого ряда следующей строки.
Если в ячейке уже есть заполненое число то опускаемся на ячейку вниз.

2)Для матриц четно-нечетного порядка(6, 10, 14 и т.д.).
Суть метода в разделении основного квадрата (с порядком 2N) на 4 вдвое меньших (с порядком N), заполнению сначала левого верхнего по сиамскому методу,
затем копирования его в остальные триквадрата и прибавления к каждому элементу:
N*N*2 для правого нижнего; N*N*3 для правого верхнего; N*N*4 для левого нижнего.
Затем производим небольшие перестановки верхних квадратов и нижних, а именно:
у каждого верхнего квадрата столбцы ((N-3)/2) которые ближе всего к центру основного квадрата паралельно меняем с нижними квадратами:
у верхнего левого квадрата параллеьно меняем в первом столбце крайние элементы с нижним квадратом;
во втором столбце меняем у левых квадратов друг с другом все элементы кроме крайних.

 3)Для матриц четно-четного порядка, порядок которых делиться на четыре (4, 8, 12, 16 и т.д.)
Стрятся два массива порядка N, один массив заполняется от 1 до N*N, другой от N*N до 1.
Затем оба массива разделяются на квадраты с порядком 4, и диагонали каждого из малого квадрата меняются с диагоналями других аналагичных квадратов двух больших массивов.
 */

import java.util.Arrays;

public class Task16 {

	public static void main(String[] args) {
		int order = 16;
		int[][] matrix = new int[order][order];
		
		if (order % 2 == 1) {
			matrix = squareOddOrder(order);
		}
		
		else if (order / 2 % 2 == 1) {
			matrix = squareEvenOddOrder(order);
		}
		
		else {
			matrix = squereEvenOrder(order);
		}
		
		imageAndSumOfMatrixElements(matrix);
		
	}
	
	

	public static int[][] squareOddOrder (int order) {
		int matrix[][] = new int[order][order];
		
		int y = 0;
		int x = matrix.length / 2;
		int count = 1;
        while (true){
            matrix[y][x] = count;

            count++;
            if (((y == 0) && (x >= order - 1)) && (matrix[order - 1][0] != 0)){
                y++;
            }
            else {
                y--;
                if (y < 0) {
                    y = order - 1;
                }
                x++;
                if (x == order) {
                    x = 0;
                }
                if(matrix[y][x]!=0){
                    y+=2;
                    x--;
                }
            }

            if(count == order * order + 1) {
            	break;
            }
        }
		return matrix;
	}
	
	
	private static int[][] squareEvenOddOrder(int order) {

        int half = order/2;

        int[][] matrix = new int[order][order];
        int[][] tempMatrix;
        tempMatrix = squareOddOrder(half);

        // 1/4 матрицы
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                matrix[i][j] = tempMatrix[i][j];
            }
        }
        // 2/4 матрицы
        for (int i = 0; i < half; i++) {
            for (int j = half; j < order; j++) {
                int x = j-half;
                matrix[i][j] = (tempMatrix[i][x]+2*half*half);
            }
        }
        // 3/4 матрицы
        for (int i = half; i < order; i++) {
            for (int j = 0; j < half; j++) {
                int x = i-half;

                matrix[i][j] = (tempMatrix[x][j]+3*half*half);
            }
        }
        // 4/4 матрицы
        for (int i = half; i < order; i++) {
            for (int j = half; j < order; j++) {
                int x = i - half, y = j - half;
                matrix[i][j] = (tempMatrix[x][y] + half * half);
            }
        }
        int move = 0;
        for (int i = 6; i < order; i++) {
            if((i %4 != 0) && ( i % 2 == 0)) move++;
        }
        for (int j = matrix.length / 2 - move; j <= matrix.length / 2 + move - 1; j++) {
            for (int i = 0; i < tempMatrix.length; i++) {

                int key = matrix[i][j];
                matrix[i][j] = matrix[half+i][j];
                matrix[half+i][j] = key;
            }
        }
        for (int j = 0; j <= 1; j++) {
            if (j == 0) {
                int key = matrix[0][0];
                matrix[0][0] = matrix[half][0];
                matrix[half][0] = key;
            }
            if (j == 1) {
                int key = matrix[half - 1][0];
                matrix[half - 1][0] = matrix[order - 1][0];
                matrix[order - 1][0] = key;
            }
        }
        for (int j = half + 1; j < order - 1; j++) {
            for (int i = 1; i < half - 1; i++) {
                int key = matrix[i][1];
                matrix[i][1] = matrix[half + i][1];
                matrix[half + i][1] = key;
            }
        }
        return matrix;
    }
	
	
	
	private static int[][] squereEvenOrder(int order){
        
        int counter = 1;
		int[][] matrix = new int[order][order];
        for(int i = 0; i < order; i++) {
        	for(int j = 0; j < order; j++) {
        		matrix[i][j] = counter;
        		counter++;
        	}
        }
        counter--;
        int[][] tempMatrix = new int[order][order];
        for(int i = 0; i < order; i++) {
        	for(int j = 0; j < order; j++) {
        		tempMatrix[i][j] = counter;
        		counter--;
        	}
        }

        int size = 4;    
        int x = 0;       
        int y = 0;
        for (int i = 0; i < (order * order / 16); i++) {         
            if (x == (int)Math.sqrt(order * order / 16)) {              
                x = 0;
                y++;
            }
            
            for (int j = 0; j < 4; j++) {
                matrix[size * y + j][size * x + j] = tempMatrix[size * y + j][size * x + j];  // главная диагональ квадратов 4х4
                matrix[size * y + j][size * x + size - 1 - j] = tempMatrix[size * y + j][size * x + size - 1 - j]; // побочная диагональ
            }
            x++;
        }
        return matrix;
    }
	
	
	// метод для изображения матрицы и подсчета суммы элементов строк, столбцов и диагоналей
	private static void imageAndSumOfMatrixElements(int[][] matrix) {
		System.out.println("Matrix looks like:");
	    for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
	    }
	    
	    System.out.print("\nSum of columns elements: ");
	    for(int j = 0; j < matrix.length; j++) {
	    	int sum = 0;
	    	for(int i = 0; i < matrix.length; i++) {
	    		sum = sum + matrix[i][j];
	    	}
	    	System.out.print(sum + ", ");
	    }
	    
	    System.out.print("\nSum of lines elements: ");
	    for(int i = 0; i < matrix.length; i++) {
	    	int sum = 0;
	    	for(int j = 0; j < matrix.length; j++) {
	    		sum = sum + matrix[i][j];
	    	}
	    	System.out.print(sum + ", ");
	    }
	    
	    System.out.print("\nSum of main diagonals elements: ");
	    int sumOfDiag = 0;
	    for(int i = 0; i < matrix.length; i++) {
	    	sumOfDiag = sumOfDiag + matrix[i][i];
	    }
	    System.out.print(sumOfDiag + ", ");
	    sumOfDiag = 0;
	    for(int i = 0; i < matrix.length; i++) {
	    	sumOfDiag = sumOfDiag + matrix[i][matrix.length - 1 - i];
	    }
	    System.out.print(sumOfDiag);
	}

}
