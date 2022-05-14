package ru.davydov.algoritmization.decomposition;

/* 8. Задан массив D. Определить следующие суммы:
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех
 * последовательно расположенных элементов массива с номерами от k до m.
 * */

public class Task8 {

	public static void main(String[] args) {
		
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("D[l] + D[2] + D[3] = " + sumOfThree(array, 1));

		System.out.println("D[3] + D[4] + D[5] = " + sumOfThree(array, 3));
		
		System.out.println("D[4] + D[5] + D[6] = " + sumOfThree(array, 4));
	}
	
	private static int sumOfThree (int[] array, int k) {
		int sum = 0;
		
		for (int i = k; i <= k + 2; i++)
			sum = sum + array[i];
		
		return sum;
	}
}
