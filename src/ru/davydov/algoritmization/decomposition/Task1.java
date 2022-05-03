package ru.davydov.algoritmization.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя
 * и наименьшего общего кратного двух натуральных чисел:
 * */

public class Task1 {

	public static void main(String[] args) {
		
		long gcd = gcd(9, 6);
		System.out.println("Наибольший общий делитель: " + gcd);
		
		long lcm = lcm(9, 6);
		System.out.println("Наименьшее общее кратное: " + lcm);
	}
	
	// наибольший общий делитель
	private static long gcd (long a, long b) {
		
		if (b == 0) {
	        return a;
	    }
		return gcd(b, a % b);
	}
	
	//наименьшее общее кратное
	public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
}
