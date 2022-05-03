package ru.davydov.algoritmization.matrix;

import java.util.Arrays;

//7. Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.

public class Task7 {

    public static void main(String[] args) {
        int n = 6;
        double[][] matrix = new double[n][n];
        
        int counterPositiv = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2) / matrix.length));
                if (matrix[i][j] > 0) {
                    counterPositiv++;
                }
            }
        }

        System.out.println("Матрица имеет следующий вид: ");
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        System.out.println("\nПоложительных элементов в матрице: " + counterPositiv);
    }
}