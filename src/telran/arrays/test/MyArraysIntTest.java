package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static telran.arrays.MyArraysInt.*;

public class MyArraysIntTest {

	@Test
	void testAddNumbers() {
		int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = addNumbers(arr, 6);
        int[] expectedArr = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedArr, newArr);
	}

	@Test
	void testRemoveNumber() {
		int[] array = { 9, 8, 7, 6, 5 };
		int[] newArr = removeNumber(array, 2);
		int[] expectedArr = { 9, 8, 6, 5 };
		assertArrayEquals(expectedArr, newArr);

		newArr = removeNumber(array, -1);
		assertArrayEquals(array, newArr);

		newArr = removeNumber(array, 7);
		assertArrayEquals(array, newArr);
	}

	@Test
	void testInsertNumber() {
		int[] array = { 5, 10, 15, 20, 25 };
		int[] newArr = insertNumber(array, 3, 12);
		int[] expectedArr = { 5, 10, 15, 12, 20, 25 };
		assertArrayEquals(expectedArr, newArr);

		newArr = insertNumber(array, -1, 30);
		assertArrayEquals(array, newArr);

		newArr = insertNumber(array, 7, 30);
		assertArrayEquals(array, newArr);

		newArr = insertNumber(array, 0, 2);
		int[] expectedArr2 = { 2, 5, 10, 15, 20, 25 };
		assertArrayEquals(expectedArr2, newArr);
	}

	@Test
	void testBinarySearchInt() {
		int[] arr = { 5, 10, 15, 20, 25 };
		int key = 15;

		int index = Arrays.binarySearch(arr, key);
		assertEquals(2, index);

		key = 30;
		index = Arrays.binarySearch(arr, key);
		assertEquals(-6, index);
	}

	@Disabled
	@Test
	void testCopyOf() {
		int array[] = { 1, 2, 3 };
		int expected1[] = { 1, 2, 3 };
		int expected2[] = { 1 };
		int expected3[] = { 1, 2, 3, 0, 0, 0 };

		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}

	@Disabled
	@Test
	void testArrayCopy() {
		int array[] = { 1, 2, 3 };
		int expected[] = { 1, 5, 10, 1, 2, 20 };
		int arrayDest[] = new int[5];
		int array1[] = { 1, 5, 10 };

		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4] = 20;

	}

}
