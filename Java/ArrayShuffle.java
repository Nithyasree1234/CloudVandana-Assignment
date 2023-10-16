package Assignment;
import java.util.Scanner;
import java.util.Random;

public class ArrayShuffle {
	public static int[] ShuffleArray(int[] arr) {
		 Random rand = new Random();
	        for (int i = arr.length - 1; i > 0; i--) {
	            int j = rand.nextInt(i + 1);
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<=array.length-1;i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		array = ShuffleArray(array);
		System.out.println("Shuffled array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
	}

}
