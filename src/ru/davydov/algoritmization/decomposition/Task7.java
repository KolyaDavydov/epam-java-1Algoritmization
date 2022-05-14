package ru.davydov.algoritmization.decomposition;

/* 7. Написать метод(методы)
 * для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * */

public class Task7 {

	public static void main(String[] args) {
		
		int sum = sumFactorialOddNumb(9);
		
		System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 = " + sum);	
	}

	private static int sumFactorialOddNumb (int maxNumb) {
		
		int sum = 0;
		
		for(int i = 1; i <= maxNumb; i = i + 2)
			sum = sum + factorial(i);
		return sum;
	}
	
	private static int factorial(int n) {
		int factorial = 1;
		
		for(int i = 1; i <= n; i++) 
			factorial = factorial * i;
		
		return factorial;
	}
}
