package org.testing;

public class TestingGIT {

	public static void main(String[] args) {
		
		int a=13;
		int b=0;
		
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				b++;
				break;
			}
		}
		if (b==0) {
			System.out.println("Given num is Prime number");
		} else {
            System.out.println("Given num is nonPrime number");
		}
	}
}
