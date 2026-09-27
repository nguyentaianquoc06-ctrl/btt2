package Palindrome;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d = a;
		int b;
		int c = 0;
		while (a != 0) {
			b = a % 10;
			c = c * 10 + b;
			a = a / 10;
		}
		if (d == c) {
			System.out.println("hop ly");
		}
	}
}
