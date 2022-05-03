package ru.davydov.algoritmization.array;

import java.util.Arrays;

/* 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
*/


public class task5 {

	public static void main(String[] args) {
		int[] array = new int[20];
		
		// Заполняем массив случайными целыми числами и выводим его
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}
		System.out.println("Исходная последовательность: " + Arrays.toString(array) + "\n");
		
		// выводим числа для которых аi > i
		for (int i = 0; i < array.length; i++) {
			if(array[i] > i) {
				System.out.println("Элемент " + array[i] + " под номером " + i);	
			}
		}
	}
}
