package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {

	public static int[] addNumbers(int[] array, int num) {
		int[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[newArray.length - 1] = num;
		return newArray;
	}

	public static int[] removeNumber(int[] array, int index) {
		if (index < 0 || index >= array.length) {

			return array;
		}
		int[] newArray = new int[array.length - 1];
		
		System.arraycopy(array, 0, newArray, 0, index);
		System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
		
		return newArray;
	}

	public static int[] insertNumber(int[] array, int index, int num) {
		if (index < 0 || index > array.length) {
            return array;
        }
		
        int[] newArray = new int[array.length + 1];
        
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = num;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        
        return newArray;
    }
	
}
