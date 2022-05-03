package ru.davydov.algoritmization.array;

/* 4. Даны действительные числа а1 ,а2 ,..., аn .
 Поменять местами наибольший и наименьший элементы.
*/

public class Task4 {

	public static void main(String[] args) {
		double[] array = new double[10];
		
		double minValue = Double.MAX_VALUE;
		double maxValue = Double.MIN_NORMAL;
		
		int counterMin = 0;
		int counterMax = 0;
		// заполняем массив случайными действительными числами
		for(int i = 0; i < 10; i++) {
			array[i] = Math.random() * 10 - 5;
		}
		
		// Выводим последовательность до замены
		System.out.print("Последовательность действительных чисел до замены: ");
		for (double num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				counterMin = i;
			}
			if (array[i] > maxValue) {
				maxValue = array[i];
				counterMax = i;
			}
		}
		array[counterMin] = maxValue;
		array[counterMax] = minValue;
		
		// Выводим последовательность после замены
		System.out.print("Последовательность действительных чисел после замены: ");
		for (double num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
