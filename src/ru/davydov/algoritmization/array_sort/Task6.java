package ru.davydov.algoritmization.array_sort;


import java.util.Arrays;

/*
	6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
	Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
	на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
	Составить алгоритм этой сортировки.
*/


public class Task6 {
    public static void main(String[] args) {
    	int[] sequence = createArray(10);
		System.out.println("Source sequence:\n" + Arrays.toString(sequence));
		
		shellSort(sequence);
		System.out.println("\nSource after sort by Shell method:\n" + Arrays.toString(sequence));
	}
	
	
	// Создание произвольной последовательности
	public static int[] createArray (int size) {
		 
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}
		return array;
	}
	
	//Алгоритм для сортировки методом Шелла.
	public static void shellSort(int[] array)  {
        int h = 1;
     // ищем начальное значение h
        while (h*3 < array.length)
            h = h * 3 + 1;   // (1, 4, 13, 40, 121, ...)

        while(h >= 1) {
            for (int i = h; i < array.length; i++) {
            	for (int j = i; j >= h; j = j - h) {
            		if(array[j] < array[j - h]) {
            			int var = array[j];
            			array[j] = array[j - h];
            			array[j - h] = var;
            		}
            		else break;
            	}
            }
            h = h/3;
        }
    
	}
        
      
}
