package com.bilgeadam.boost.challenge01;

import java.util.Scanner;

public class Fractions {
	int numerator;
	int denominator;
	static Scanner sc = new Scanner(System.in);

	public Fractions(int numr, int denr) {
		numerator = numr;
		denominator = denr;
		reduce();
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public int calculateGCD(int numerator, int denominator) {
		if (numerator % denominator == 0) {
			return denominator;
		}
		return calculateGCD(denominator, numerator % denominator);
	}

	void reduce() {
		int gcd = calculateGCD(this.numerator, this.denominator);
		numerator /= gcd;
		denominator /= gcd;
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public static void main(String[] args) {

		Fractions f1 = new Fractions(getNumerator(1), getDenominator(1));
		System.out.println(f1.toString());

		Fractions f2 = new Fractions(getNumerator(2), getDenominator(2));
		System.out.println(f2.toString());

		doOperation(f1, f2);

	}

	private static void doOperation(Fractions f1, Fractions f2) {
		System.out.print("Choose an operator: +, -, *, or / : ");
		Fractions f3 = null;
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			f3 = f1.add(f2);
			System.out.println("Result of addition of " + f1 + " and " + f2 + " is : " + f3);
			break;
		case '-':
			f3 = f1.subtract(f2);
			System.out.println("Result of subtraction of " + f1 + " and " + f2 + " is : " + f3);
			break;
		case '*':
			f3 = f1.multiply(f2);
			System.out.println("Result of multiplication of " + f1 + " and " + f2 + " is : " + f3);
			break;
		case '/':
			f3 = f1.divide(f2);
			System.out.println("Result of division of " + f1 + " and " + f2 + " is : " + f3);
			break;
		default:
			System.out.println("Invalid operator!");

		}
	}

	private static int getDenominator(int i) {
		System.out.print("Enter the denominator of the " + i + ". number: ");
		int number = sc.nextInt();
		return number;
	}

	private static int getNumerator(int i) {
		System.out.print("Enter the numerator of the " + i + ". number: ");
		int number = sc.nextInt();
		return number;
	}

	public Fractions add(Fractions fractionTwo) {
		int numer = (numerator * fractionTwo.getDenominator()) + (fractionTwo.getNumerator() * denominator);
		int denr = denominator * fractionTwo.getDenominator();
		return new Fractions(numer, denr);
	}

	public Fractions subtract(Fractions fractionTwo) {
		int newNumerator = (numerator * fractionTwo.denominator) - (fractionTwo.numerator * denominator);
		int newDenominator = denominator * fractionTwo.denominator;
		Fractions result = new Fractions(newNumerator, newDenominator);
		return result;
	}

	public Fractions multiply(Fractions fractionTwo) {
		int newNumerator = numerator * fractionTwo.numerator;
		int newDenominator = denominator * fractionTwo.denominator;
		Fractions result = new Fractions(newNumerator, newDenominator);
		return result;
	}


	public Fractions divide(Fractions fractionTwo) {
		int newNumerator = numerator * fractionTwo.getDenominator();
		int newDenominator = denominator * fractionTwo.numerator;
		Fractions result = new Fractions(newNumerator, newDenominator);
		return result;
	}
}
