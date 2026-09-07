package Aug;

public class aug01d {

	public static void main(String[] args) {int i = 90;
	int c = 0;

	System.out.print("The Divisir is:");

	for (int num = 2; num <= 100; num++) {

		if (i % num == 0) {
			c++;
			System.out.print(num + " ");
		}
	}

	System.out.println("Total count is : " + c);

	if (c == 0) {
		System.out.print("hello");
	}}
}