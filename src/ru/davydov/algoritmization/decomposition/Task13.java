package ru.davydov.algoritmization.decomposition;

/*
 * 13. Два простых числа называются «близнецами»,
 * если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 * */

public class Task13 {

	public static void main(String[] args) {
		
		int n = 1000;
		
		System.out.print("Пары простых близнецов в промежутке от " + n + " до " + 2 * n + ": ");
		
		if(!primeTwins(n))
			System.out.print(" отсутствуют.");
	}
	
	//определяет простые ли числа близнецы, и если да, то выводит их на экран
	private static boolean primeTwins (int num) {
		
		boolean flag = false;
		
		for(int i = num; i <= 2 * num - 2; i++) {
			if(isPrime(i) && isPrime(i + 2)) {
				System.out.print(i + " и " + (i + 2) + "; ");
				flag = true;
			}
		}
	return flag;
	}
	
	//определяет простое ли переданное число, если простое возвращает true
	private static boolean isPrime(int num) {
		
		boolean isPrime = true;
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
