package btvn2;

import java.util.Scanner;

class NumberWrapper {
	private int value;

	public NumberWrapper(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class swaptrichk {

	public static void swap(NumberWrapper a, NumberWrapper b) {
		NumberWrapper temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberWrapper n1 = new NumberWrapper(scan.nextInt());
		NumberWrapper n2 = new NumberWrapper(scan.nextInt());
		swap(n1, n2);
		System.out.println(n1.getValue());
		System.out.println(n2.getValue());
	}
}