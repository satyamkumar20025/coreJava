package ArrayQuestion;

import java.util.Scanner;

public class ReverseArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input array size
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Print array in reverse order
	        System.out.println("Array in reverse order:");
	        for (int i = n - 1; i >= 0; i--) {
	            System.out.println(arr[i]);
	        }

	        sc.close();
	    }
	}
}
