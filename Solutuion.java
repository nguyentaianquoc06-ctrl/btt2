package prime;

import java.util.Scanner;

public class Solutuion {

	public static boolean prime(int n) {

		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= n / i; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		if (prime(a)) {
			System.out.println("la so nt");
		} else {
			System.out.println("ko la so nt");
		}
	}
}