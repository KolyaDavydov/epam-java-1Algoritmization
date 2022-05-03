package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//14.  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//     единиц равно номеру столбца

public class Task14 {

  public static void main(String[] args) {
      int n = (int) (Math.random() * 5) + 3;
      int m = (int) (Math.random() * 5) + 3;
      int[][] matrix = new int[n][m];

      for (int i = 0; i < matrix.length; i++) {
          for (int j = i; j < matrix[i].length; j++) {
              matrix[i][j] = 1;
          }
      }
      
      System.out.println("Матрица имеет вид:");
      for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
      }

  }
}  