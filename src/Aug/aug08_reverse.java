package Aug;

public class aug08_reverse {

	public static void main(String[] args) {
		
		
		int num=321;		
		int rev=0;
		int rem=0;
		while (num>0) //
		{
			rem = num%10;
			//321%10=1
			//32%10=2
			//3%10=3
			//1%10=1
			rev=rev*10+rem;//0*10+1=1
			//1*10+2=12
			//12*10+3=123
			//123--final
			num=num/10;

		}

		System.out.println(rev);
		
//		if (num==rev) 
//		{
//			System.out.println()
//		}
		
	}

}
