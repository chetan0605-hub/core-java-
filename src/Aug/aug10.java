package Aug;

import java.util.Scanner;

public class aug10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of digits of the give no

		int no,num;
		int rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("number:");
		no=sc.nextInt();
		num=no;
		//		do 
		//		{
		//			rem=no%10; //1234%10=4 ,123%10=3, 12%10=2.2%10=1
		//			sum=sum+rem;// 0+4=4, 3+4=7, 7+2=9,9+1=10.
		//			no=no/10;//1234/10=123, 123/10=12 ,12/10=2 , 2/10=0 .
		//
		//		}while (no>0);
		//		System.out.println("Sum of digits is :"+sum);


		//reverse for the digits of given no 

		do 
		{
			rem=num%10;//123%10=3  
			rev=rev*10+rem;//0+3=3.10*3+2=32 , 10*32+1=321
			num=num/10;//123/10=12 

		}while (no>0);
	  //System.out.println("Reverse No:"+sum);
		//System.out.println();


		if  (no==rev) 
		{
			System.out.println(" its a palindrome"+rev);
		}
		else

		{
			System.out.println("Not a palidrome");
		}


	}}
