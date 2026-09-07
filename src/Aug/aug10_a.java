package Aug;

public class aug10_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1ls set of the loop
		// rows = 1-5 
		// inner loop -1 to <row
		// 2nd set of loop
		//outer -4 to 1 
		// inner -4 40 >=row
		System.out.println("-----------------28 ------------------");
		for (int i=1;i<=5;i++) 
		{
			char ch='A';
			for (int j=1;j<=i;j++) 
			{
				System.out.print(ch++);
			}
			System.out.println();

		}
		for (int i=1;i<=5;i++) 
		{
			char ch='A';
			for (int j=4;j>=i;j--) 
			{
				System.out.print(ch++);
			}
			System.out.println();

		}
		System.out.println("--------- 27 -----------");


		char ch='A';
		for (int i=1;i<=5;i++) 
		{
			//char ch1='A';
			for (int j=1;j<=i;j++) 
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println();

		}
		ch='D';
		for (int i=1;i<=5;i++) 
		{
			//char ch='A';
			for (int j=4;j>=i;j--) 
			{
				System.out.print(ch);
			}
			ch--;
			System.out.println();

		}
		System.out.println("-------------------");



		char ch2='A';
		for (int i=1;i<=5;i++) 
		{
			//ch2++;

			for (int j=1;j<=i;j++) 
			{
				//ch++;
				System.out.print(ch2);			
			}
			ch2++;
			System.out.println();

			//char ch3
			for (int i1=4;i1>=1;i1--) 
			{
				//ch2++;

				for (int j=1;j<=i1;j++) 
				{
					//ch++;
					System.out.print(ch2);			
				}
				ch2++;
				System.out.println();
			}


		}
		System.out.println("------------------");


		char ch1 = 'a';

		for (int row = 1; row <= 7; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(ch1 + " ");
				ch1++;
			}

			System.out.println();
		}



		System.out.println("*************patter no: 31************");

		char ch5 = 'A';

		for (int i = 1; i <= 5; i++) {

			// Spaces
			for (int s = 4; s >= i; s--) {
				System.out.print(" ");
			}

			// Characters
			for (int j = 1; j <= i; j++) {
				System.out.print(ch5 + " ");
				ch5++;
			}

			// New line
			System.out.println();
		}		

		System.out.println("-------------------");
		char ch51 = 'A';

		for (int i = 5; i >= 1; i--) {

			// Spaces
			for (int s = 4; s >= i; s--) {
				System.out.print(" ");
			}

			// Characters
			for (int j = 1; j <= i; j++) {
				System.out.print(ch51 + " ");
				ch51++;
			}

			// New line
			System.out.println();


		}
		System.out.println("---------------------");

		char ch511 = 'F';

		for (int i = 1; i <= 5; i++) {


			{
				for (int j = 1; j<=i; j++) {
					System.out.print(ch511 + " ");
					ch511++;
				}


				System.out.println();
			}
		}

		System.out.println("******** 37 ******");

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= i; j++) {

				char ch11 = (char)('A' + (j - 1) * 6 + (i - 1));

				System.out.print(ch11 + " ");
			}

			System.out.println();
		}
		System.out.println("//////////////////////////");
	}


}





