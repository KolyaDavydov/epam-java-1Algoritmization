package ru.davydov.algoritmization.decomposition;

/*
 * 11. Написать метод(методы), определяющий,
 * в каком из данных двух чисел больше цифр.
 * */

public class Task11 {

	public static void main(String[] args) {

		int num1 = 723598629;
		int num2 = 43985;
		
		largerOfTwo(num1, num2);

	}
	
	private static void largerOfTwo(int a, int b) {
		
		if(numOfDigit(a) > numOfDigit(b))
			System.out.println("в числе " + a + " больше цифр");
		
		else if(numOfDigit(a) < numOfDigit(b))
			System.out.println("в числе " + b + " больше цифр");
		
		else if(numOfDigit(a) == numOfDigit(b))
			System.out.println("в числах " + b + " и " + a + " цифр одинаково");
	}
	
	//определяет количество цифр в числе
	private static int numOfDigit (int num) {
		
		String str = Integer.toString(num);
		
		char[] charArray = str.toCharArray();
		
		return charArray.length;
	}
}
