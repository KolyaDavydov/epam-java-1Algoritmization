package ru.davydov.algoritmization.decomposition;

/*
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 * */

public class Task15 {

	public static void main(String[] args) {
		
		int numDigit = 5;
		
		printNumbIncreasingDigit(numDigit);

	}
	
	private static void printNumbIncreasingDigit(int digit) {
		
		System.out.print("Все " + digit + "-значные числа с строго возрастающими числами: ");
		
		for(int i = 1; i <= (10 - digit); i++) {
			
			int num = 0;
			for(int j = i; j < (digit + i); j++) {
				num = (int) (num + j * Math.pow(10, digit + i - j - 1));
			}
			System.out.print(num + "; ");
		}
	}
}
