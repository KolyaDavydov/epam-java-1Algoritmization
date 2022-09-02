package ru.davydov.algoritmization.array;

/* 
 	1. В массив A [N] занесены натуральные числа.
 	Найти сумму тех элементов, которые кратны данному К
 */

public class Task1 {

	public static void main(String[] args) {
		int[] array = new int[100];
		
		int k = 7;
		
		int sum = 0;
		
		// Заносим в массив рандомные натуральные числа от 1 до 100
		for(int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		for(int i = 0; i < 100; i++) {
			if(array[i] % k == 0) {
				sum = sum + array[i];
			}
		}
		System.out.println("Сумма элементов массива кратных числу " + k + ": " + sum);
	}

}
