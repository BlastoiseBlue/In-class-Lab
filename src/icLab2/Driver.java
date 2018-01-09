package icLab2;

import java.util.Random;

public class Driver {
	public static int[][] makeArrayOne(int y, int x) {
		int[][] arr = new int[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++)
				arr[i][j] = 1;
		}
		return arr;
	}

	public static int[][] makeArrayRandom(int y, int x) {
		int[][] arr = new int[y][x];
		Random r = new Random();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = r.nextInt(10);
			}
		}
		return arr;
	}
	public static int[][] multiplyArray(int[] arr1,int n){
		int[][] arr2=new int[n][arr1.length];
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<n;j++) {
				arr2[j][i]=arr1[i]*(j+1);
			}
		}
		return arr2;
	}
	public static int total(int[][]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	public static int[] compact(int[][] arr1) {
		int[] arr2=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			int sum=0;
			for(int j=0;j<arr1[i].length;j++) {
				sum+=arr1[i][j];
			}
			arr2[i]=sum;
		}
		return arr2;
	}
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr1 = makeArrayOne(3, 4);
		printArray(arr1);
		int[][] arr2 = makeArrayRandom(3, 4);
		printArray(arr2);
		int[] arr3= {8,4,5,-1};
		int[][] arr4=multiplyArray(arr3,3);
		printArray(arr4);
		System.out.println(total(arr1));
		System.out.println(total(arr4));
		int[] arr5=compact(arr4);
		printArray(arr5);
	}

}
