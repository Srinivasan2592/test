package org.sample;

public class program {
	public static void main(String[] args) {

		int num = 5840888;
		int res = 0;

		while (num > 0) {
//			int a = num % 10;
			res = (res ) + 1;
			num = num / 10;

		}
		System.out.println("reverse of given number" + res);

	}
}