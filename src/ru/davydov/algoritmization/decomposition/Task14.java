package ru.davydov.algoritmization.decomposition;

/* 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 * */

public class Task14 {

	public static void main(String[] args) {

		int k = 2_000_000;
		
		printArmstrongNumber(k);

	}
	
	private static void printArmstrongNumber(int k) {
		
		System.out.print("Числа Армстронга: ");
		
		for (int i = 1; i <= k; i++) {
			if(isArmstrong(i)) 
				System.out.print(i + "; ");
		}
		
	}
	
	private static boolean isArmstrong(int num) {
		
		String str = Integer.toString(num);
		
		char[] charArray = str.toCharArray();
		
		int[] array = new int[charArray.length];
		
		for(int i = 0; i < array.length; i++)
			array[i] = Character.getNumericValue(charArray[i]);
		
		int n = 0;
		
		for(int i = 0; i < array.length; i++) 
			n = (int) (n + Math.pow(array[i], array.length));
		
		if (num == n)
			return true;
		else
			return false;
	}
}
