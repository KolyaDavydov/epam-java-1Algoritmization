package ru.davydov.algoritmization.array_sort;

/*
	Даны дроби p1/q1, p2/q2 ... pn/qn(p и q - натуральные).
	Составить программу, которая приводит эти дроби к общему
	знаменателю и упорядочивает их в порядке возрастания.
*/

public class Task8 {

	public static void main(String[] args) {
		
		int[][] fraction = creatSequenceOfFractions(4); //создаем дроби
		
		System.out.println("Даны дроби:");
		printFractions(fraction); // выводим дроби на экран
		
		toCommonDenominator(fraction);
		System.out.println("\n\nПриведение к общему знаменателю:");
		printFractions(fraction); // выводим дроби с общим знаменателем на экран 
		
		sortBySelection(fraction);
		System.out.println("\n\nПосле сортировки:");
		printFractions(fraction);
		
	}
	
	private static int[][] creatSequenceOfFractions(int n){
		int[][] fractions = new int[n][2];
		
		for (int i = 0; i < fractions.length; i++) {
			
			fractions[i][0] = 1 + (int)(Math.random() * 5);
			fractions[i][1] = 1 + (int)(Math.random() * 5);
		}
		
		return fractions;
	}
	
	private static void printFractions(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i][0] + "/" + array[i][1] + ";  ");
		}
	}
	
	// приведение к общему знаменателю
	private static void toCommonDenominator(int[][] array) {
		int commonDenominator = 1;
		
		for(int i = 0; i < array.length; i++) 
			commonDenominator *= array[i][1];
		
		for(int i = 0; i < array.length; i++) {
			array[i][0] = commonDenominator / array[i][1] * array[i][0];
			array[i][1] = commonDenominator;
		}	
	}
	
	// сортировка выбором
		private static void sortBySelection(int[][] array) {
			for (int i = 0; i < array.length; i++) {
				
	            int max = array[i][0];
	            int pos = i;
	            
	            for(int j = i + 1; j < array.length; j++) {
	            	if(array[j][0] < max) {
	            		pos = j;
	            		max = array[j][0];
	            	}
	            }
	            array[pos][0] = array[i][0];
	            array[i][0] = max;
			}
		}
	
}
