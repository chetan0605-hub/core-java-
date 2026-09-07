package Aug;

public class aug04_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row =1; row<=5;row++) // row =1
		{
			for (int col=5;col>=row;col--) // star =1 star >=1
			{
				System.out.print("*");
			}
			System.out.println();

		}

		//System.out.println("--------------------------------------------");
		for (int row = 1; row<=5; row++) 
		{
			for (int col =1;col<=row;col++) 
			{
				System.out.print("*" );
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		for (int row = 1; row <= 9; row++) {

			if (row <= 5) {
				for (int star = 1; star <= row; star++) {
					System.out.print("*");
				}
			} 
			else 
			{
				for (int star = 1; star <= 10 - row; star++) {
					System.out.print("*");
				}
			}

			System.out.println();


		}

		System.out.println("--------------------------------------------");
		for (int row = 1; row <= 9; row++) {

			if (row <= 5) {
				for (int star = 1; star <= row; star++) {
					System.out.print("*");
				}
			} 
			else 
			{
				for (int star = 1; star <= 10 - row; star++) {
					System.out.print("*");
				}
			}

			System.out.println();


		}

		System.out.println("---------------------pattern 9 -----------------------");

		for (int row = 1 ; row<=5;row++) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}

			for (int star=1 ;star<=row;star++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");

		for (int row = 5;row>=1;row--) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}

			for (int star=1 ;star<=row;star++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");

		for (int row =5 ;row>=1;row--) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}
			for (int star=1;star<=row*2-1;star++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		for (int row =1 ;row<=5;row++) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}
			for (int star=1;star<=row*2-1;star++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}



		System.out.println("--------------------------------------------");

		for (int row=1;row<=5;row++) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}
			for (int star=1; star<=5;star++)  
			{
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("--------------------------------------------");


		for (int row=5;row>=1;row--) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}
			for (int star=1; star<=5;star++)  
			{
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("--------------------------------------------");

		for (int row=5;row>=1;row--) 
		{
			for (int s=4;s>=row;s--) 
			{
				System.out.print(" ");
			}
			for (int star=1; star<=5;star++)  
			{
				if (row==1 || row==5 || star==1 || star==5) 
				{
					System.out.print("*");
				}
				//System.out.print("*");
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
