package ru.davydov.algoritmization.decomposition;

/* 6/ Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * */

public class Task6 {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 14;
		int c = 20;
		
		relativPrimeNumbers (a, b, c);

	}
	
	private static void relativPrimeNumbers (int a, int b, int c) {
		
		int notMin; // цикл будет проходится до этого не минимального числа
		
		if (a > c)
			notMin = a;
		else if (b > c)
			notMin = b;
		else notMin = c;
		
		boolean flag = false;
		
		for(int i = 2; i <= notMin; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0)
				flag = true;
		}
		
		if (!flag)
			System.out.println("Числа " + a + ", " + b + " и " + c + " взаимно простые");
		else System.out.println("Числа " + a + ", " + b + " и " + c + " НЕ взаимно простые");
	}
	
	
}
