package homework;

public class aug11_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		System.out.println("************pattern 01:****************");	
		for (int row=1;row<=4;row++) 
		{
			for (int col=1;col<=4;col++) 

			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("*****************pattern no 02:***********");
		for (int i=1;i<=5;i++) 
		{
			for (int j=5;j>=i;j--) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("********************* pattern no :03 *************************");	

		//outer loop 
		for (int i=1;i<=4;i++) 

		{
			//inner loop
			for (int j=1;j<=5;j++) 
			{
				if(i==1 || j==1 ||i==4 ||j==5) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------------------");
		for (int i=1;i<=10;i++) 
		{
			System.out.println("*");
		}

	}

}
