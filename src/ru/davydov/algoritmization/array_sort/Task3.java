package ru.davydov.algoritmization.array_sort;

import java.util.Arrays;

/*3. Сортировка выбором. Дана последовательность чисел a1  a2  an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
*/

public class Task3 {

	public static void main(String[] args) {
		int[] array = createSequence(9);
		System.out.println("Source sequence:\n" + Arrays.toString(array));
		
		sortBySelection(array);
		System.out.println("\nSequence after sort by selection:\n" + Arrays.toString(array));
	}
	
	
	//Создаем массив
	private static int[] createSequence(int lengthArray) {
		int[]array = new int[lengthArray];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}
		return array;
	}
	
	
	// сортировка выбором
	private static int[] sortBySelection(int[] array) {
		for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int pos = i;
            for(int j = i + 1; j < array.length; j++) {
            	if(array[j] > max) {
            		pos = j;
            		max = array[j];
            	}
            }
            array[pos] = array[i];
            array[i] = max;
		}
		return array;
	}

}
