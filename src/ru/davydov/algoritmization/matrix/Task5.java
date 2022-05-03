package ru.davydov.algoritmization.matrix;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task5 {
	
	public static void main(String[] args) {
		int n = 8;
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				matrix[i][j] = i + 1;
				
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
