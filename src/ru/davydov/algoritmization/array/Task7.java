package ru.davydov.algoritmization.array;

/*
	7. Даны действительные числа a1,a2,,an.
	Найти max( a1 + a2n,a2 + a2n−1, ... ,an + an+1) .
*/

public class Task7 {

	public static void main(String[] args) {
		int sizeArray = 2 * 5;
		
		double[] array = new double[sizeArray];
		double sum = Double.MIN_NORMAL;
		
		for(int i = 0; i < sizeArray; i++) {
			array[i] = Math.random() * 20;
		}
		
		for(int i = 0; i < sizeArray / 2; i++) {
			if((array[i] + array[sizeArray -1 - i]) > sum) {
				sum = array[i] + array[sizeArray - 1 - i];
			}
		}
		
		for (double n : array) {
			System.out.println(n);	
		}
		
		System.out.println(sum);
	}

}
