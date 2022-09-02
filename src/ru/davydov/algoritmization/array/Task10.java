package ru.davydov.algoritmization.array;

import java.util.Arrays;

/*
	10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
	элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {

    public static void main(String[] args) {
    	int[] array = new int[20];
    	for (int i = 0; i < array.length; i++) {
    		array[i] = i + 1;
    	}
    	System.out.println("Исходный массив: " + Arrays.toString(array));
    	
    	int j = 0;
    	for(int i = 0; i < array.length; i = i + 2) {
    		array[j] = array[i];
    		j++;
    	}
    	
    	for(int i = array.length / 2; i < array.length; i++) {
    		array[i] = 0;
    	}
    	System.out.println("Массив после сжатия и замены кадого второго элемента на '0': " + Arrays.toString(array));
    }
	
}
