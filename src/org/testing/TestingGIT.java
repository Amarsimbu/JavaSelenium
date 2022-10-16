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
<<<<<<< HEAD
		System.out.println("Prime number is 2 3 5 7 ");
		System.out.println("Non Prime number is 4 6 8 10");
=======
		
		System.out.println("Print the prime number");
		System.out.println("Print the non prime number");
>>>>>>> 89569085c6ce4395b6486b8aa591b58e3fe22a32
	}
}
