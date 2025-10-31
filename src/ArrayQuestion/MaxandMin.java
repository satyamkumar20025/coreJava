package ArrayQuestion;

import java.util.Scanner;

public class MaxandMin {
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

	        // Initialize max and min
	        int max = arr[0];
	        int min = arr[0];

	        // Traverse the array
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	    
	        // Output results
	        System.out.println("Maximum element: " + max);
	        System.out.println("Minimum element: " + min);

	        sc.close();
	        
	    }
	}

