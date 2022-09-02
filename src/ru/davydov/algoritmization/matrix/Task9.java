package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

/*
	9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
	столбец содержит максимальную сумму
*/

public class Task9 {

	public static void main(String[] args) {
		int n = 6;
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		int numOfColumn = 0;
		int sumMax = 0;
		for(int j = 0; j < n; j++) {
			int summ = 0;
			for(int i = 0; i < n; i++) {
				summ = summ + matrix[i][j];
			}
			
			if(summ > sumMax) {
				sumMax = summ;
				numOfColumn = j + 1;
			}
			
		}
		
		System.out.println("\nСтобец под номером " + numOfColumn + " имеет наибольшую сумму элементов равную: " + sumMax);

	}

}

