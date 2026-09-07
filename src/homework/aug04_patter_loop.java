package homework;

public class aug04_patter_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------pattern-----------");

		// 5*5 pattern 
		// row + col = 5 
		for( int row = 1;row<=5;row++) 
		{
			for (int col=1;col<=5;col++) 
			{
				//System.out.print(row);
				//System.out.print(col);
				System.out.print(" * ");
			}
			System.out.println("");

		}
		//		System.out.println();
		System.out.println("******************************");




		//		for (int row=9;row>=1;row--) 
		//
		//		{
		//			for (int s=4;s>=1;s--) {
		//				System.out.print(" ");
		//			}
		//			for (int col=5;col>=row*2-1;col-- )  {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		//		//System.out.println();



		for (int row=1;row<=9;row++) 
		{

			for (int space=4;space >=row;space--) 
			{
				System.out.println(" ");

				for (int col=1;col<=9;col++) {}
			}

		}




	}

}
