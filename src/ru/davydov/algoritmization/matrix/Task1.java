package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {

	public static void main(String[] args) {
		int sizeX = 5;
		int sizeY = 6;
		int[][] matrix = new int[sizeX][sizeY];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 30); 
			}		
		}
		System.out.println("Исходный массив: " + Arrays.deepToString(matrix));
		
		
		for (int i = 0; i < matrix[0].length; i += 2) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                System.out.println("Столбец №" + (i + 1) + ": ");
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][i] + ", ");
                }
                System.out.println();
            }
        }
	}

}
