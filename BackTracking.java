package com.bilgeadam.boost.challenge01;

import java.util.Scanner;

public class BackTracking {
	public static void main(String[] args) {
		String original, reverse = "";
		boolean runAgain = true;
		Scanner sc = new Scanner(System.in);
		do {
			reverse="";
			System.out.print("Enter the string: ");
			original = sc.nextLine();
			int length = original.length();

			for (int i = length - 1; i >= 0; i--)
				reverse = reverse + original.charAt(i);
			System.out.println("Reverse string is: "+reverse);
			
			//recursive
			reverse= doReverse(reverse);
			System.out.println("Reversing orginal string(with recursive)");
			System.out.println("Your string is: "+reverse);
			
			
			System.out.println("\nWanna run it again? (Y/N)");
			String input = sc.next();
			sc.nextLine();
			
			if (!input.equalsIgnoreCase("Y")) {
				runAgain = false;
			}

		} while (runAgain);
		
		System.out.println("\nBye...");
		sc.close();
	}

	private static String doReverse(String str) {
		if (str.isEmpty())
            return str;
		return doReverse(str.substring(1)) + str.charAt(0);
	}


}
