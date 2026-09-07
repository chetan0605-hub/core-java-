package Aug;

public class july08_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ABCDE
		//ABCDE
		//ABCDE
		//ABCDE
		//ABCDE

		for  (int i =1;i<=5;i++) 
		{
			for (char col='A';col<='E';col++) 
			{
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//A
		//AB
		//ABC

		// 

		for (char row='A';row<='C';row++) 
		{
			for(char col='A';col<=row;col++) 
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
