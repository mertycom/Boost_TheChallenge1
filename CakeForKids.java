package com.bilgeadam.boost.challenge01;

import java.util.Scanner;

/*
 * Not finish yet :))
 */

public class CakeForKids {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		readInput();
	}

	private static void readInput() {
		System.out.print("Enter the cake's number: ");
		int c = sc.nextInt();
		System.out.print("Enter the kid's number: ");
		int k = sc.nextInt();
		System.out.println("-------------------------------");
		showPossibility(c, k);
	}

	private static void showPossibility(int c, int k) {
		String alphabet = "abcdefghi";
		int possibility = c*k;
		char[] cakes = new char[possibility];
		int index = 0;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < k; j++) {
				cakes[index] = alphabet.charAt(i);
				index++;
			}
		}
		for (int i = 1; i <= k; i++) {
			System.out.print("Kid " + i + " \t");
		}
		System.out.println();
		System.out.println(cakes);

	}

}
