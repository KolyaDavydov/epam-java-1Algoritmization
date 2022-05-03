package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

  public static void main(String[] args) {
      int n = 4;
      int m = 7;
      int[][] matrix = new int[n][m];

      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[i].length; j++) {
              matrix[i][j] = (int) (Math.random() * 10);
          }
      }
      
      System.out.println("Исходная матрица имеет вид:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

      for (int i = 0; i < matrix.length; i++) {
          Arrays.sort(matrix[i]);
      }
      
      System.out.println("\nВид после сортировки каждой строки по возрастанию значений элементов:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

      for(int i = 0; i < matrix.length; i++) {
    	  for (int j = 0; j < matrix[i].length / 2; j++) {
    		  int var = matrix[i][matrix[i].length - j - 1];
    		  matrix[i][matrix[i].length - j - 1] = matrix[i][j];
    		  matrix[i][j] = var;
    	  }
      }
     
      System.out.println("\nВид после сортировки каждой строки по убыванию значений элементов:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

  }
}
