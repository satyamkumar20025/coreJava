package StringQuestion;

import java.util.Scanner;

public class StringQuestion {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine().toLowerCase();

	        int[] frequency = new int[26]; 

	        for (char ch : input.toCharArray()) {
	            if (ch >= 'a' && ch <= 'z') {
	                frequency[ch - 'a']++;
	            }
	        }

	        System.out.println("\nLetter Frequencies:");
	        for (int i = 0; i < 26; i++) {
	            if (frequency[i] > 0) {
	                System.out.println((char)(i + 'a') + ": " + frequency[i]);
	            }
	        }

	        sc.close();
	    }
	}

