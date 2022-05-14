package ru.davydov.algoritmization.decomposition;

import java.util.Arrays;

/* 12. Даны натуральные числа К и N.
 * Написать метод(методы) формирования массива А,
 * элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N.
 * */
public class Task12 {

	public static void main(String[] args) {
		int k = 9;
		
		int n = 200;
		
		int[] array = arrayOfNum(k, n);
		
		System.out.println(Arrays.toString(array));
	}
	
	//возвращает массив согласно условию
	private static int[] arrayOfNum(int k, int n) {
		
		int counter = 0;
		for(int i = 0; i <= n; i++) {
			if(sumOfDigit(i) == k)
				counter++;
		}
		
		int[] array = new int[counter];
		
		int elementOfArray = 0;
		
		for(int i = 0; i <= n; i++) {
			if(sumOfDigit(i) == k) {
				array[elementOfArray] = i;
				
				elementOfArray++;
			}
				
		}
		return array;
	}
	
	//возвращает сумму цифр переданного числа
	private static int sumOfDigit(int num) {
		
		int sum = 0;
		
		String str = Integer.toString(num);
		
		char[] charArray = str.toCharArray();
		
		for(int i = 0; i < charArray.length; i++)
			sum = sum + Character.getNumericValue(charArray[i]);
		
		return sum;
	}
}
