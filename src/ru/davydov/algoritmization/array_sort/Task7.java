package ru.davydov.algoritmization.array_sort;

import java.util.Arrays;

//7. Пусть даны две неубывающие последовательности действительных чисел a1  a2  an и b1  b2  bm .
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1  b2  bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Task7 {
	public static void main(String[] args) {
		int[] sequenceA = createArray(5);
		int[] sequenceB = createArray(4);
		
		System.out.println("A sequence: " + Arrays.toString(sequenceA) + "\nB sequence: " + Arrays.toString(sequenceB));
		
		printInsertIndex(sequenceA, sequenceB);
	}
	
	
	// Создание возрастающей последовательности
	public static int[] createArray (int size) {
		 
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}
		Arrays.sort(array);
		return array;
	}
	
	
	public static void printInsertIndex(int[] arrayA, int[] arrayB) {
		int i = 0;	// для прохода по массиву А
		int j = 0;	// для прохода по массиву B
		
		do{
            if(i < arrayA.length && j < arrayB.length) {
                if (arrayA[i] > arrayB[j]) {
                    System.out.println("Insert b[" + j + "]" + " before a[" + i + "]");
                    if (j < arrayB.length) {
                        j++;
                    }
                } else {
                    if (i < arrayA.length) {
                        i++;
                    }
                }
            }else if(j < arrayB.length){
                System.out.println("Insert b[" + j + "] - b[" + (arrayB.length-1) + "] after the last element of array A");
                break;
            }else{
                break;
            }
        }while(i < arrayA.length || j < arrayB.length);

	}	
}
