package Aug;

public class aug03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row=1 ;row<=5;row++) 
		{
			for (int col=1;col<=5;col++) 
			{
				System.out.print(" 22 ");
			}
			System.out.println();
		}

System.out.println("--------------------------------------------");

		for (int row =1; row<=5;row++) // row =1
		{
			for (int col=5;col>=row;col--) // star =1 star >=1
			{
				System.out.print("  11  ");
			}
			System.out.println();

		}

		System.out.println("--------------------------------------------");
		for (int row = 1; row<=5; row++) 
		{
			for (int col =1;col<=row;col++) 
			{
				System.out.print(" 20 " );
			}
			System.out.println();
		}


		//		for (int row = 1; row <= 5; row++) {
		//
		//
		//			for (int s = 4; s >= row; s--) {
		//				System.out.print(" ");
		//			}
		//
		//
		//			for (int col = 1; col <= row; col--) {
		//				System.out.print("* ");
		//			}
		//
		//			System.out.println();
		//		}
		System.out.println("--------------------------------------------");
		for (int row = 1; row <= 5; row++) {


			for (int s = 5; s > row; s--) {
				System.out.print(" ");
			}


			for (int col = 1; col <= row; col++) {
				System.out.print("05");
			}


			System.out.println();
		}
		System.out.println("--------------------------------------------");
		for (int row = 1; row <= 5; row++) {


			for (int s = 1; s < row; s++) {
				System.out.print(" ");
			}


			for (int col = 5; col >= row; col--) {
				System.out.print("01");
			}


			System.out.println();
		}

		//		for (int row=1;row<=5;row++)
		//		{
		//			for (int s=1;s < row ;row++) 
		//			{
		//				System.out.print(" ");
		//
		//				for (int col = 5;col >=row ; col--)
		//				{
		//					System.out.print("2211");
		//				}
		//			}
		//
		//		}
		//		System.out.println();
		System.out.println("--------------------------------------------");

		for (int row = 1; row <= 5; row++) {
		    for (int col = 5; col >= row; col--) {
		        System.out.print("55 ");
		    }
		    System.out.println();
		}
		System.out.println("--------------------------------------------");
		
		int r=9;
		for (int row=1;row<=9;row++) 
		{
			if(row<=5)  
			{
			 for (int star=r;star<=row;star++) 
			 { 
				 System.out.print("*");
			 }
			 System.out.println();
			}
		}
	}

}
