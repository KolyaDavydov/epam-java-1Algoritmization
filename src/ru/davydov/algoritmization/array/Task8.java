package ru.davydov.algoritmization.array;

/*
8. Дана последовательность целых чисел a1,a2,,an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,,an) .
*/

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		//создаем и заполняем массив случайными целыми числами
		int[] oldArray = new int[20];
		for(int i = 0; i < oldArray.length; i++) {
			oldArray[i] = (int) (Math.random() * 10 - 7);
		}
		
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < oldArray.length; i++) {
			if(oldArray[i] < min) {
				min = oldArray[i];
			}
		}
		System.out.println("Минимальное число в последовательности: " + min);
		
		int counterMin = 0;		
		for(int i = 0; i < oldArray.length; i++) {
			if (oldArray[i] == min) {
				counterMin++;
			}
		}
		System.out.println("Количество минимальных чисел в последовательности: " + counterMin);
		
		int[] newArray = new int[oldArray.length - counterMin];
		
		int counterNewArrayIndex = 0;
		for(int i = 0; i < oldArray.length; i++) {
			if(oldArray[i] != min) {
				newArray[i - counterNewArrayIndex] = oldArray[i];
			}
			else {
				counterNewArrayIndex++;
			}
		}
		
		System.out.println("Исходная последовательность: " + Arrays.toString(oldArray)+ " элементов: " + oldArray.length);
        System.out.println("Новая последовательность: " + Arrays.toString(newArray) + " элементов " + newArray.length);
	}

}
