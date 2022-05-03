package ru.davydov.algoritmization.array_sort;

import java.util.Arrays;

/*
 2. Даны две последовательности.
 Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 Примечание. Дополнительный массив не использовать.
*/

public class Task2 {

	public static void main(String[] args) {
		int[] arrayFirst = createArray();
		System.out.println("First sequence:");
		printArray(arrayFirst);
		
		int[] arraySecond = createArray();
		System.out.println("\nSecond sequence:");
		printArray(arraySecond);
		
		int[] concatenateArray = concatenateArray(arrayFirst, arraySecond);
		System.out.println("\nConcatenate sequence:\n" + Arrays.toString(concatenateArray));

	}
	
	
	private static int[] createArray() {
		int[] array = new int[(int) (Math.random() * 5) + 5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}
		Arrays.sort(array);
		return array;
	}
	
	private static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	//Метод для объединения массива и сортировки элементов по возрастанию
	private static int[] concatenateArray(int[] arrayFirst, int[] arraySecond) {
		int[] concatenateArray = new int[arrayFirst.length + arraySecond.length];
		System.arraycopy(arrayFirst, 0, concatenateArray, 0, arrayFirst.length);
		System.arraycopy(arraySecond, 0, concatenateArray, arrayFirst.length, arraySecond.length);
		Arrays.sort(concatenateArray);
		return concatenateArray;
	}
}
