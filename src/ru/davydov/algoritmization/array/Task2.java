package ru.davydov.algoritmization.array;

import java.util.Arrays;

/*
	2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
	Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {

	public static void main(String[] args) {
		double[] array = new double[10];
		
		int counter = 0;
		
		double k = 10.1;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 20;
		}
		System.out.println("Исходная последовательнсть: " + Arrays.toString(array));
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > k) {
				counter++;
				array[i] = k;
			}
		}
		System.out.println("Последовательноть после замен: " + Arrays.toString(array));
		System.out.println("Number of replacements: " + counter);
	}

}
