package ru.davydov.algoritmization.decomposition;

/*
 * 17. Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 * */

public class Task17 {

	public static void main(String[] args) {
		
		int num = 999;
		
		int counter = 0;
		
		while(num > 0) {
			num = subtractionSumDigit(num);
			counter++;
		}
		
		System.out.println("Количество операций для достижения нуля согласно условию: " + counter);

	}
	
	private static int subtractionSumDigit(int num) {
		
		String str = Integer.toString(num);
		
		char[] charArray = str.toCharArray();
		
		int[] array = new int[charArray.length];
		
		for(int i = 0; i < array.length; i++)
			array[i] = Character.getNumericValue(charArray[i]);
		
		
		for(int i = 0; i < array.length; i++)
			num = num - array[i];
		
		return num;
		
	}
	
}
