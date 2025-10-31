package ArrayQuestion;

import java.util.*;


	public class ArrayPalindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        boolean isPalindrome = true;
	        for (int i = 0; i < n / 2; i++) {
	            if (arr[i] != arr[n - 1 - i]) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        System.out.println(isPalindrome ? "Array is a palindrome" : "Array is not a palindrome");

	        sc.close();
	    }
	}