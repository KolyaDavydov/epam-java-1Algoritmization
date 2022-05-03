package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

	public static void main(String[] args) {
		int sizeX = 5;
		int sizeY = 5;
		int[][] matrix = new int[sizeX][sizeY];
		
		//создаем и выводим на экран квадратной матрицы
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10); 
			}		
		}
		System.out.println("Исходный массив: " + Arrays.deepToString(matrix));
		
		System.out.println("Выводим элементы находящиеся на диагонали:");

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if((i == j) || (i + j) == (sizeX - 1)) {
					System.out.print(" " + matrix[i][j] + " ");
				}
				else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

}
