package ru.davydov.algoritmization.matrix;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int sizeX = 6;
		int sizeY = 5;
		int[][] matrix = new int[sizeX][sizeY];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10); 
			}		
		}
		for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
		
		int k = (int) (Math.random() * sizeX);
		int p = (int) (Math.random() * sizeY);
		System.out.println("Необходимо вывести на экран " + (k + 1) + "-ю строку и " + (p + 1) + "-й столбец");
		
		System.out.println("\nстолбец №" + (p + 1) + ": ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][p] + ", ");
        }

        System.out.println("\n\nстрока №" + (k + 1) + ": ");
        for(int i = 0; i < matrix[k].length; i++){
            System.out.print(matrix[k][i] + ", ");
        }
		
	}

}
