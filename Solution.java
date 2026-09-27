package Ucln;

import java.util.Scanner;

public class Solution {
	public static int gcd(int a, int b) {
		int temp = 0;
		for (int i = b; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				temp = i;
				break;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ucln = gcd(a, b);
		System.out.println(ucln);
		scan.close();
	}
}
