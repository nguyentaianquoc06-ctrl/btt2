package finacio;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int f1 = 0;
		int f2 = 1;
		int fn = 0;
		for (int i = 1; i <= t; i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}
		System.out.println(fn);
	}

}
