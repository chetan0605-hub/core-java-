package Aug_OOPs;

import java.util.Scanner;

public class aug13_sumFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c1=new Scanner(System.in);
		//int x=c1.nextInt();
		aug13_second s1 = new aug13_second(); // objects 
		//s1.sum(10,20);
		
		System.out.print("Enter the 1st no:"); 
		int x=c1.nextInt();
		
//int x =s1.sum(c1.nextInt(), c1.nextInt());
		
		System.out.print("Enter the 2nd no:");
		int y = c1.nextInt();
		
		
		int z=s1.sum(x, y);
		
		

		System.out.println("addition is a = "+z);
		
		
		//System.out.println(x);
		
		

	}

}
