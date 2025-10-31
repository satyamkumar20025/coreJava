package ArrayQuestion;


	import java.util.Scanner;

	public class SelectionSort {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Selection Sort logic
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            // Swap
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }

	        System.out.println("Sorted array using Selection Sort:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    }
	}

