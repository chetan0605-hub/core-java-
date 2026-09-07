package Aug_OOPs;

import java.util.Scanner;

class ArithmeticOperations {

	void add(int num1, int num2) {
		System.out.println("add: " + (num1 + num2));
	}

	void sub(int num1, int num2) {
		System.out.println("sub: " + (num1 - num2));
	}

	void multi(int num1, int num2) {
		System.out.println("multilpy: " + (num1 * num2));
	}

	void div(int num1, int num2) {
		System.out.println("divide: " + (num1 / num2));
	}
}

public class aug12_basic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter two numbers:-----");
		System.out.print("enter the 1st no:");
		//System.out.println("enter the 2nd no:");
		int num1 = sc.nextInt();
		System.out.print("enter the 2nd no:");
		int num2 = sc.nextInt();

		ArithmeticOperations ob = new ArithmeticOperations();

		ob.add(num1, num2);
		ob.sub(num1, num2);
		ob.multi(num1, num2);
		ob.div(num1, num2);

		sc.close();
	}
}