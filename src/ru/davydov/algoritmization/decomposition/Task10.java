package ru.davydov.algoritmization.decomposition;

import java.util.Arrays;

/*10. Дано натуральное число N.
 * Написать метод(методы) для формирования массива,
 * элементами которогоявляются цифры числа N.
 * */

public class Task10 {

	public static void main(String[] args) {

		int n = 329587483;
		
		int[] array = numToIntArray(n);
		
		System.out.println(Arrays.toString(array));

	}
	
	private static int[] numToIntArray(int num) {
		
		String str = Integer.toString(num);
		
		char[] charArray = str.toCharArray();
		
		int[] array = new int[charArray.length];
		
		for(int i = 0; i < array.length; i++)
			array[i] = Character.getNumericValue(charArray[i]);
		
		return array;
	}
}
