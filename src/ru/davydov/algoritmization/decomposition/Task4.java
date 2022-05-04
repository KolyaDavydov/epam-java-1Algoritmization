package ru.davydov.algoritmization.decomposition;

import java.util.Arrays;

/*
 * 4. На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив
 * */

public class Task4 {

	public static void main(String[] args) {
		
		int[][] arrayOfPoint = createArray(5);
		
		maximumDistance(arrayOfPoint);

	}
	
	//создание произвольного массива точек
	private static int[][] createArray(int amountOfPoint) {
		
		int[][] array = new int[amountOfPoint][2];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++)
				array[i][j] = (int) (Math.random() * 20) - 10;
		}
		
		System.out.println("Были созданы следующие точки : " + Arrays.deepToString(array));
		
		return array;
	}
	
	//определение максимального расстояния между точками и вывод этих точек
	private static void maximumDistance(int[][] array) {
		
		int[] point1 = new int[2];
		int[] point2 = new int[2];
		
		double maxDistance = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(distance(array[i], array[j]) > maxDistance) {
					maxDistance = distance(array[i], array[j]);
					
					point1 = array[i];
					point2 = array[j];
				}
			}
		}
		
		System.out.println("Наиболее удаленые точки: " + Arrays.toString(point1) + " и " + Arrays.toString(point2) + 
		". Расстояние между ними = " + maxDistance);
	}
	
	//определение расстояния между точками
	private static double distance(int[] point1, int[] point2) {
		
		double distance = Math.sqrt(Math.pow((point2[0] - point1[0]), 2) + Math.pow((point2[1] - point1[1]), 2));
		
		return distance;
		
	}
	
}
