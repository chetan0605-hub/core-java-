package Aug;

public class aug07_patttern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1 ;row<=5;row++) 
		{

			for (int s=4;s>=row;s--) 
			{
				System.out.print("1");
			}
			for (int col = 1;col<=row;col++)  
			{
				System.out.print(row);
			}
			System.out.println();

		}
		System.out.println("--------------110----------------");



		for (int row = 5 ;row>=1;row--)//5<1=T , 4<1 
		{
			for (int s=row;s<5;s++) 
			{
				System.out.print(s);
			}

			for (int col=1;col <=row;col++) 
			{

				System.out.print("5");
			}	
			System.out.println();
		}
		//		System.out.println("---------------------");
		//
		//
		//
		//		for (int row = 1; row <= 5; row++) {
		//
		//			int value = 6 - row;
		//
		//			for (int col = 1; col <= 5; col++) {
		//
		//				if (col < row) {
		//					System.out.print(value++);
		//				} else {
		//					System.out.print(5);
		//				}
		//
		//			}
		//
		//			System.out.println();
		//		}
		System.out.println("---------112---------");

		for (int row=5;row>=1;row--)   // 5>=1-> T , 5>=4 = T 
		{
			for (int s=5;s>=row;s--) // 5>=5 > s=0 , 5-1=4 ,5-2=3,5-3=2,5-1=1 
			{
				System.out.print(s);// space print 
			}
			for (int col=1;col<=5;col++) // 1<rowis 4 =T ,
			{
				System.out.print(row); //print row 
			}
			System.out.println();
		}	
		System.out.println("--------------------");

		//12345
		//2345*
		//345**
		//45***
		//5****
		for (int row=1;row<=5;row++) 
		{
			for (int s=row;s<=5;s++) 
				//				System.out.print(s);
			{
				System.out.print(s);

			}
			for (int col=1;col<=row;col++)  
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		
		for (int row=1;row<=5;row++) 
		{
			for (int s=5;s>=row;s--) 
				//				System.out.print(s);
			{
				System.out.print(s);

			}
			for (int col=1;col<row;col++)  
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
