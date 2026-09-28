package sumdigits;

import java.util.Scanner;

public class Solution {
	public int sumOfDigits(int n) {
		if (n < 0) {
			n = -n;
		}
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Solution s = new Solution();
		System.out.println(s.sumOfDigits(n));
	}
}