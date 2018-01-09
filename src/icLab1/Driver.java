package icLab1;

import java.util.Random;

public class Driver {
	public static double findMean(int[] arr) {
		/*
		 * int total = 0; for (int i = 0; i < arr.length; i++) total = total + arr[i];
		 * double avg = (double) total / (double) arr.length;
		 */
		return (double) sum(arr) / (double) arr.length;
	}

	public static int sum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++)
			total += arr[i];
		return total;
	}

	public static int[] generateRandomInts() {
		int[] arr = new int[1000];
		Random r = new Random();
		for (int i = 0; i < 1000; i++)
			arr[i] = 10 + r.nextInt(20);
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void printArray(String[] s) {
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println();
	}

	public static int[] makeBigger(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr2[i] = arr[i] * 2;
		return arr2;
	}

	public static int[] onlyEvenPositions(int[] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++)
			if (i % 2 != 0)
				n++;
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++)
			arr2[i] = arr[2 * i + 1];
		return arr2;
	}

	public static String[] findA(String[] s) {
		int n = 0;
		int index = -1;
		for (int i = 0; i < s.length; i++) {
			if (s[i].toLowerCase().startsWith("a"))
				n++;
		}
		String[] s2 = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = index + 1; j < s.length; j++) {
				if (s[j].toLowerCase().startsWith("a")) {
					s2[i] = s[j];
					index = j;
					break;
				}
			}
		}
		return s2;
	}

	public static String[] intersection(String[] s1, String[] s2) {
		int shortest = 0;
		if (s1.length > s2.length)
			shortest = s2.length;
		else
			shortest = s1.length;
		int n = 0;
		int index = -1;
		for (int i = 0; i < shortest; i++)
			if (s1[i].equalsIgnoreCase(s2[i]))
				n++;
		String[] s3 = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = index + 1; j < shortest; j++) {
				if (s1[j].equalsIgnoreCase(s2[j])) {
					s3[i] = s1[j].toLowerCase();
					index = j;
					break;
				}
			}
		}
		return s3;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 7, 4, 2, 6, 1, 9 };
		System.out.println(findMean(arr1));
		int[] arr2 = generateRandomInts();
		// printArray(arr2);
		System.out.println(findMean(arr2));
		int[] arr3 = makeBigger(arr1);
		printArray(arr3);
		int[] arr4 = onlyEvenPositions(arr1);
		printArray(arr4);
		System.out.println(sum(arr4));
		String[] s1 = { "one", "apple", "is", "Around", "ten" };
		printArray(s1);
		printArray(findA(s1));
		String[] s2 = { "this", "Apple", "weighs", "around", "Ten", "pounds" };
		printArray(intersection(s1, s2));
	}
}
