package com.bilgeadam.boost.challenge01;

import java.util.Scanner;

public class MatrisTranspoze {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the line of the sequence you want to know the transpose of: ");
		int row = sc.nextInt();
		System.out.print("Enter the column of the sequence you want to know the transpose of: ");
		int col = sc.nextInt();

		int[][] list = new int[row][col];
		int[][] list2 = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter "+ (i+1) + ". line " + (j+1) + ". element: ");
				list[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				list2[j][i] = list[i][j];
			}
		}
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[i].length; j++) {
				System.out.print(list2[i][j] + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
