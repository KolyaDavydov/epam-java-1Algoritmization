package ru.davydov.algoritmization.decomposition;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {

  public static void main(String[] args) {

	  int gcd = gcd(54, 36, 63, 27);
	  System.out.println("Наибольший общий делитель: " + gcd);
  }

  public static int gcd(int a, int b){
      return b == 0 ? a : gcd(b,a % b);
  }

  public static int gcd(int a, int b, int c, int d){
      return gcd(gcd(a,b), gcd(c,d));
  }
}
