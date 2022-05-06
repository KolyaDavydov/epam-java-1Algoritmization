package ru.davydov.algoritmization.decomposition;

import java.util.Arrays;

/* 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 * */

public class Task5 {

	public static void main(String[] args) {
		// Заполняем массив случайными числами и выводи его на экран
		int[] array = new int[6];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		
		System.out.println("Иссходный массив: " + Arrays.toString(array));
		
		secondMaxValue(array);

	}
	// Находим и выводим число меньше максимального, но больше остальных
	private static void secondMaxValue(int[] array) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			}
			
			if (array[i] < max && array[i] > secondMax)
				secondMax = array[i];
		}
		
		System.out.println("Второе по величине число: " + secondMax);
	}

}
