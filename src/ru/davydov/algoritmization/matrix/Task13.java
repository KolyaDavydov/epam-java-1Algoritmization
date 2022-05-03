package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

public class Task13 {

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

      boolean flag = true;
      int temp;
      while (flag) {
          flag = false; 
          for(int j = 0; j < matrix[n - 1].length; j++) {
        	  for (int i = 0; i < matrix.length - 1; i++) {
                  if (matrix[i][j] > matrix[i + 1][j]) { 
                      temp = matrix[i][j];         
                      matrix[i][j] = matrix[i + 1][j];
                      matrix[i + 1][j] = temp;
                      flag = true;  
                  }
              }
          }
      }
      
      System.out.println("\nВид после сортировки каждого столбца по возрастанию значений элементов:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

      boolean flag1 = true;
      while (flag1) {
          flag1 = false; 
          for(int j = 0; j < matrix[n - 1].length; j++) {
        	  for (int i = 0; i < matrix.length - 1; i++) {
                  if (matrix[i][j] < matrix[i + 1][j]) { 
                      temp = matrix[i][j];         
                      matrix[i][j] = matrix[i + 1][j];
                      matrix[i + 1][j] = temp;
                      flag1 = true;  
                  }
              }
          }
      }
     
      System.out.println("\nВид после сортировки каждой строки по убыванию значений элементов:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

  }
}
