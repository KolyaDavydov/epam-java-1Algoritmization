package ru.davydov.algoritmization.array_sort;

import java.util.Arrays;

/*

4.  Сортировка  обменами.  Дана  возрастающая последовательность  чисел.
Требуется  переставить  числа  в порядке  возрастания.
Для  этого  сравниваются  два  соседних  числа.
Если левое больше правого,  то  делается перестановка.
Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Task4 {

	public static void main(String[] args) {
		int[] array = creatArray(15);
		sortByExchange(array);

	}
	
	// Заполняем  и выводим массив возрастающей последовательностью
	private static int[] creatArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(array);
		System.out.println("Source sequense:\n" + Arrays.toString(array));
		return array;
	}
	
	// Сортруем обменом и подсчитываем количество перестановок
	private static void sortByExchange(int[] array) {
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] < array[j + 1]) {
					int var = array[j];
					array[j] = array[j + 1];
					array[j + 1] = var;
					counter++;
				}
			}
		}
		System.out.println("\nSequence after exchange sort:\n" + Arrays.toString(array));
		System.out.println("\nCount of exchange: " + counter);
	}
	
}
