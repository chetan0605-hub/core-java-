package Aug;

import java.util.Scanner;

public class aug11_dowhileloop {

	public static void main(String[] args) {

		int choice = 0;
		int num1 = 0;
		int num2 = 0;
		double result;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("select option from menu");
			System.out.println("1. Addition");
			System.out.println("2. subtraction");
			System.out.println("3. multiplication");
			System.out.println("4. division");
			System.out.println("5. exits");

			System.out.println("Enter the choice:");
			choice = sc.nextInt();

			if (choice >= 1 && choice <= 4) {
				System.out.println("Enter the Arithmetic operation");

				System.out.println("*enter the 1st no:");
				num1 = sc.nextInt();
				System.out.println("**enter the 2nd no:");
				num2 = sc.nextInt();
			}


			switch (choice) {

			case 1:
				result = num1 + num2;
				System.out.println("Add: " + result);
				break;

			case 2:
				result = num1 - num2;
				System.out.println("Sub: " + result);
				break;

			case 3:
				result = num1 * num2;
				System.out.println("Multiply: " + result);
				break;

			case 4:
				if (num2 != 0) {
					result = (double) num1 / num2;
					System.out.println("Div: " + result);
				} else {
					System.out.println("We cannot divide by 0...");
				}
				break;

			case 5:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Please enter valid choice...");
			}

		} while (choice != 5);

		System.out.println("******** End ********");

		sc.close();
	}
}