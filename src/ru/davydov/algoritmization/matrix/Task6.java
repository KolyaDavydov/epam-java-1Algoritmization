package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task6 {
	
	public static void main(String[] args) {
		int n = 8;
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			
			if(i < 4) {
				for(int j = i; j < n - i; j++) {
					matrix[i][j] = 1;
				}
			}
			
			if(i >= 4) {
				for(int j = n - i - 1; j < i + 1; j++) {
					matrix[i][j] = 1;
				}
			}
			
		}
		
		for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
	}

}
