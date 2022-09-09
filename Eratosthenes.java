package com.bilgeadam.boost.challenge01;

import java.util.Scanner;

public class Eratosthenes {
	
	public static void main(String[] args) {
		System.out.print("Sayi giriniz: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		isPrime(number);
		sc.close();
	}

	private static void isPrime(int number) {
		for (int i = 1; i <= number; i++) {
			boolean isPrime = true;
			for (int j = i - 1; j >= 2; j--) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.print(i + " ");
		}
	}
}
