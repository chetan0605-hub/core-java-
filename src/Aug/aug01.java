package Aug;

public class aug01 {

	public static void main(String[] args) {

		int num =30;
		int c = 0;
		System.out.print("the divisor is :");
		for (int i=1;i<=30;i++ ) 
		{
			if (num%i==0) 
			{
				c++;
				System.out.print(i +" ");
			}
		}
		System.out.println();
		System.out.println( "the perfect no is : "+c);
	}
}