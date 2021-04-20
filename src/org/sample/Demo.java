package org.sample;

public class Demo {
	public static void main(String[] args) {
		int count = 0;
//		int a = 0;

		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {

				System.out.println("the given number" + count + "is even ");
			} else {
				System.out.println("the given number" + count + "is odd");
			}
			count++;
		}

	}
}
