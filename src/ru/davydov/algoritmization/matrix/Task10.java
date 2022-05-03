package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

/*
 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {

	public static void main(String[] args) {
		int n = 6;
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 10 - 5);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		System.out.println("На главной диагонали находятся следующие положительные элементы:");
		for(int i = 0; i < n; i++) {
			if(matrix[i][i] > 0) {
				System.out.println(" " + matrix[i][i] + ", ");
			}
		}
	}

}
