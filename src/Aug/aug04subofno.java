package Aug;

import java.util.Scanner;

public class aug04subofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("Enter the NO:");
		//		int num=sc.nextInt();
		//		//int num =3213211;
		//		int sum=0;
		//		int c=0;
		//		while (num>0) {
		//			int rem = num%10; 
		//			
		//			sum = sum + rem;
		//			c++;
		//			
		//			num = num/10;
		//			// 321%10 = 1 
		//			//32%10 = 2 
		//			//3%10=3
		//			//sum = 1+2+3 = 6
		//
		//		}
		//		System.out.println("count:"+c);
		//		System.out.println("sum:"+sum);



		System.out.println("-----------------pos,neg ,zero ---------------");

		int num = 123456;
		//int rem=0;
		if(num>0) 
		{
			System.out.println("Positive");
			while(num>0) {
				int rem =num%10;
				if (rem%2==0) 
				{
					System.out.println("Even="+rem);

				}
				else  
				{
					System.out.println("odd="+rem);
				}
				if(rem>1) 

				{
					int count =0;
					for (int i=1;i<=rem;i++) 
					{
						if(rem%i==0) 
						{	
							count++;
						}
					}
					if (count==2) 
					{
					System.out.println("prime="+ rem);	
					}
				}

				num = num/10;
			} 

		}
		else if (num<0) 
		{
			System.out.println("Negative:");

		}
		else 
		{
			System.out.println("Zero");
		}
	}

}

// 1.pos neg zero 
//2.if pos -> while separeted 
//3 rem -. even odd 
//if even -. rem -. prime 
//if prime then only print
//output is 2 only 

