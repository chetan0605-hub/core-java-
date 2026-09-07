package homework;

public class aug05_patte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Upper Part
		for (int row = 1; row <= 5; row++) {

			for (int space = 1; space < row; space++)
				System.out.print(" ");

			for (int star = 1; star <= 11 - 2 * row; star++)
				System.out.print("*");

			System.out.println();
		}

		for (int row = 2; row <= 5; row++) {

			for (int space = 5; space >= row; space--)
				System.out.print(" ");

			for (int star = 1; star <= 2 * row - 1; star++)
				System.out.print("*");

			System.out.println();
		}
		System.out.println("------------------------");


		for (int row = 1; row <= 5; row++) {

			for (int space = 1; space < row; space++)
				System.out.print(" ");

			for (int star = 1; star <= 6 - row; star++)
				System.out.print("* ");

			System.out.println();
		}

		for (int row = 2; row <= 5; row++) {

			for (int space = 5; space >= row; space--)
				System.out.print(" ");

			for (int star = 1; star <= row; star++)
				System.out.print("* ");

			System.out.println();
		}
		System.out.println("------------------------");
		for (int row = 1; row <= 5; row++) {

			for (int space = 5; space > row; space--)
				System.out.print(" ");

			for (int star = 1; star <= row; star++)
				System.out.print("* ");

			System.out.println();
		}

		for (int row = 4; row >= 1; row--) {

			for (int space = 5; space > row; space--)
				System.out.print(" ");

			for (int star = 1; star <= row; star++)
				System.out.print("* ");

			System.out.println();
		}
		System.out.println("------------------------");









		for (int row = 1; row <= 5; row++) {

			for (int space = 5; space > row; space--)
				System.out.print(" ");

			for (int star = 1; star <= (2 * row - 1); star++)
				System.out.print("*");

			System.out.println();
		}

		for (int row = 4; row >= 1; row--) {

			for (int space = 5; space > row; space--)
				System.out.print(" ");

			for (int star = 1; star <= (2 * row - 1); star++)
				System.out.print("*");

			System.out.println();
		}

		System.out.println("--------------------");
		for (int row=1;row<=5;row++)
			//System.out.print(" ");
			//			5*2=10 -> 

		{
			for (int space = 5; space > row; space--)
				System.out.print(" ");

			for (int star = 1; star <= (2 * row - 1); star++)
				System.out.print("*");

			System.out.println();
		}
		System.out.println("---------");
		for (int row =4;row>=1;row--) 
		{
			for (int space = 5; space > row; space--)
				System.out.print(" ");

			for (int star = 1; star <= (2 * row - 1); star++)
				System.out.print("*");
			System.out.println();

		}
		System.out.println("--------------------");


		for (int row=1;row<=9;row++) 
		{
			int x;
			if (row<=5) 
			{
				x= row;
			}
			else 
			{
				x=10-row;
			}
			for (int star=1;star<=x;star++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		for (int row=1;row<=9;row++) 
		{
			int x;
			int x1;
			if (row<=5) 
			{
				x= row;
				x1=5-row;
			}
			else 
			{
				x=10-row;
				x1=(row-5);
			}
			for (int star=1;star<=x1;star++) 
			{
				System.out.print(" ");
			}
			for (int col=1;col<=x;col++)
			{
				System.out.print("* ");
			}
			System.out.println();


		}
		System.out.println("----------------");

		for (int row=1;row<=9;row++) 
		{
			int x;
			int x1;
			if (row<=5) 
			{
				x= row;
				x1=5-row;
			}
			else 
			{
				x=10-row;
				x1=(row-5);
			}
			for (int star=1;star<=x1*2-1;star++) //x1*2-1
			{
				System.out.print(" ");
			}
			for (int col=1;col<=x;col++)
			{
				System.out.print("* ");
			}
			System.out.println();


		}
		System.out.println("----------------");
		for (int row=1;row<=9;row++) 
		{
			int x;
			int x1;
			if (row<=5) 
			{
				x= row;
				x1=5-row;
			}
			else 
			{
				x=10-row;
				x1=(row-5);
			}
			for (int star=1;star<=x1;star++) 
			{
				System.out.print(" ");
			}
			for (int col=1;col<=x;col++)
			{
				//if (row+1==5)
				System.out.print(x+" ");
			}

			System.out.println();


		}
		System.out.println("-------------------");

		for (int row=1;row<=9;row++) 
		{
			int x;
			int x1;
			if (row<=5) 
			{
				x= row;
				x1=5-row;
			}
			else 
			{
				x=10-row;
				x1=(row-5);
			}
			for (int s=8;s>x;s++) 
			{
				System.out.print();
			}

		}

	}

}