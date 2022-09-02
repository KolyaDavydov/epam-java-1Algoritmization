package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

/*
	11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
	Вывести на экран саму матрицу и номера строк, в
	которых число 5 встречается три и более раз
*/

public class Task11 {

	public static void main(String[] args) {
		int[][] matrix = new int[10][20];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 15);
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		System.out.print("Номера строк, в которых число 5 встречается три и более раз : ");
		for(int i = 0; i < matrix.length; i++) {
			int counter = 0;
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 5) {
					counter++;
				}
			}
			if(counter >= 3) {
				System.out.print(" " + (i + 1) + ", ");
			}
		}

	}

}
