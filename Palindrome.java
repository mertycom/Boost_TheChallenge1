package com.bilgeadam.boost.challenge01;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String original, reverse = "";
		boolean runAgain = true;
		Scanner sc = new Scanner(System.in);
		do {
			reverse="";
			System.out.println("Enter the string to be checked for palindrome");
			original = sc.nextLine();

			int length = original.length();

			for (int i = length - 1; i >= 0; i--)
				reverse = reverse + original.charAt(i);
			if (original.equals(reverse)) {
				System.out.println("is palindrome");
			} else {
				System.out.println("not palindrome");
			}
			System.out.println("Wanna run it again? (Y/N)");
			String inAgain = sc.next();
			sc.nextLine();
			
			if (!inAgain.equalsIgnoreCase("Y")) {
				runAgain = false;
			}

		} while (runAgain);
		
		System.out.println("\nBye...");
		sc.close();
	}
}
