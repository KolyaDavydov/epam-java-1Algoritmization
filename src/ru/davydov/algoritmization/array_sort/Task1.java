package ru.davydov.algoritmization.array_sort;

import java.util.Arrays;

/*
	1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
	Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)-м  элементами  первого, 
	при  этом  не  используя дополнительный массив.
*/

public class Task1 {

	public static void main(String[] args) {
		

		int lengthArray_1 = 7;

		int lengthArray_2 = 8;

		int k = 4; //Элемент после которого нужно вставить второй массив
		
		int[] array_1 = new int[lengthArray_1];
		int[] array_2 = new int[lengthArray_2];
		
		//заполняем и выводим в консоль два массива
		for(int i = 0; i < lengthArray_1; i++) {
			array_1[i] = (int) (Math.random() * 10);
		}
		System.out.println("First array:\n" + Arrays.toString(array_1));
		
		for(int i = 0; i < lengthArray_2; i++) {
			array_2[i] = (int) (Math.random() * 20);
		}
		System.out.println("\nSecond array:\n" + Arrays.toString(array_2));

		
		
		
		System.out.println("\nSummary array:\n" + Arrays.toString(concatanateArrays(array_1, array_2, k)));
	}

	
	
	public static int[] concatanateArrays(int[] srcArray1, int[] srcArray2, int numOfPosition) {
		int[] destArray = new int[srcArray1.length + srcArray2.length];
		System.arraycopy(srcArray1, 0, destArray, 0, numOfPosition);
		System.arraycopy(srcArray2, 0, destArray, numOfPosition, srcArray2.length);
		System.arraycopy(srcArray1, numOfPosition, destArray, numOfPosition + srcArray2.length, srcArray1.length - numOfPosition);
				
		return destArray;
	}
}

