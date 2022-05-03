package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task15 {

	public static void main(String[] args) {
		int n = 4;
		int m = 5;
		int[][] matrix = new int[n][m];

		for (int i = 0; i < matrix.length; i++) {
	          for (int j = 0; j < matrix[i].length; j++) {
	              matrix[i][j] = (int) (Math.random() * 10);
	          }
	      }
	      
	      System.out.println("Matrix looks like:");
	      for(int i = 0; i < matrix.length; i++) {
				System.out.println(Arrays.toString(matrix[i]));
	      }
	      
	      int maxElement = Integer.MIN_VALUE;
	      for(int i = 0; i < matrix.length; i++) {
	    	  for (int j = 0; j < matrix[i].length; j++) {
	    		  if(matrix[i][j] > maxElement) {
	    			  maxElement = matrix[i][j];
	    		  }
	    	  }
	      }
	      System.out.println("\nMaximum matrix element: " + maxElement);
	      System.out.println();
	      
	      for (int i = 0; i < matrix.length; i++){
	            for(int j = 0; j < matrix[i].length; j++){
	                if(matrix[i][j] % 2 != 0){
	                    matrix[i][j] = maxElement;
	                }
	            }
	      }
	      System.out.println("After replacement matrix looks like:");
	      for(int i = 0; i < matrix.length; i++) {
				System.out.println(Arrays.toString(matrix[i]));
	      }

	}

}
