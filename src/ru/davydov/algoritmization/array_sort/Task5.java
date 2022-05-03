package ru.davydov.algoritmization.array_sort;

import java.util.Arrays;

/*5. Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке 
* возрастания.  Делается  с помощью метода вставок. Примечание. Место помещения очередного элемента в отсортированную часть производить 
* с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции
*/

public class Task5 {

	public static void main(String[] args) {
		int[] sequence = createArray(10);
		System.out.println("Source sequence:\n" + Arrays.toString(sequence));
		
		insertionSort(sequence);
		System.out.println("\nSource after sort by insertion:\n" + Arrays.toString(sequence));
	}
	
	
	// Создание произвольного массива
	public static int[] createArray (int size) {
		 
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}
		return array;
	}
	
	
	//Метод для вставки элемента в указаный индекс.
	public static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int current = array[i];
			int index = indexBynarySearch(array, current, i - 1);
			System.arraycopy(array, index, array, index + 1, i - index);
			array[index] = current;
		}
	}
	
	// Метод для поиска индекса с ипользованием бинарного поиска.
	public static int indexBynarySearch(int[] array, int key, int high) {
		
		int low = 0;
		
		while(low <= high) {
			int mid = (int) (low + high) / 2;
			int midVal = array[mid];
			
			if (key < midVal) {
				high = mid - 1;
			}
			else if (key > midVal) {
				low = mid + 1;
			}
			else {
				return mid;
			} 
		}
		
		return low;
	}

}
