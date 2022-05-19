package ru.davydov.algoritmization.decomposition;

/*
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * */

public class Task16 {

	public static void main(String[] args) {
		
		int numOfDigit = 3;
		
		howManyEvenDigit(sumNumWithOddDigit(numOfDigit));

	}
	
	
	// возвращает сумму чисел у которых все цифры нечетные
	private static int sumNumWithOddDigit(int numOfDigit) {
		int sum = 0;
		
		for(int i = (int) Math.pow(10, numOfDigit - 1); i < Math.pow(10, numOfDigit); i++) {
			if(isOddDigit(i))
				sum = sum + i;
				
		}
		System.out.println("Cумма " + numOfDigit + " - значных чисел, содержащих только нечетные цифры = " + sum);
		return sum;
	}
	
		private static void howManyEvenDigit(int num) {
		int counter = 0;
		
		int[] array = numToArrayOfDigit(num);
		
		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				counter++;
		}
		
		System.out.println("количество четных цифр в сумме: " + counter);
	}
	
	// возвращает true, если все цифры числа нечетные
	private static boolean isOddDigit(int num) {
		
		int[] array = numToArrayOfDigit(num);
		
		boolean isOdd = true;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				isOdd = false;
				break;
			}
				
		}
		return isOdd;
	}
	
	// возвращает число в виде массива цифр
	private static int[] numToArrayOfDigit (int num) {
		String str = Integer.toString(num);
		
		char[] charArray = str.toCharArray();
		
		int[] array = new int[charArray.length];
		
		for(int i = 0; i < array.length; i++)
			array[i] = Character.getNumericValue(charArray[i]);
		
		return array;
	}
}
