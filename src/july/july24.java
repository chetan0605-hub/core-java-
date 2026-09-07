package july;
import java.util.Scanner;
public class july24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 Scanner sc=new Scanner(System.in);
	 
	 int n1;
	 System.out.println("Enter the NO1 :");
	 n1 =sc.nextInt();
	 int n2;
	 
	 System.out.println("Enter the No2");

	 n2=sc.nextInt();
	 
	 
	 
System.out.println("Addition :"+(n1+n2));

System.out.println("sub : "+ (n1 - n2));
System.out.println("multi : "+ (n1 * n2));
System.out.println("div : "+ (n1 / n2));
System.out.println("mod : "+ (n1 % n2));

//// area of circle = 3.14*r*r;
System.out.println("Enter radius:");
float r=sc.nextFloat();
float area  = 3.14f*r*r;
System.out.println("Area ="+area);

////area of triangle = 0.5*base*height;
////area of rectangle = length*breath;
//
////Increment and Decrement/Unary Operator 
//// ++--
////pre ++x increment then assign
//// post x++ - first assign and then increment 
//// --x OR x--
//
//
//
//
System.out.println("Enter then for num:");
int num=sc.nextInt();//5
//
int ans=num++;
System.out.println(ans);
//
int ans1=num;
System.out.println(ans1);
//
int ans2=++num;
System.out.println(ans2);
		
		Scanner sc1=new Scanner(System.in);
		int days;
		System.out.println("Enter the Days:");
		days =sc1.nextInt();
		
		// Scanner ->  class 
		// util -> package
		
		 //int days = 500;
		 
		int year = days/365;
		System.out.println(year);
		
		int rem = days%365;	
		System.out.println(rem);
		

		
		int month = rem/30;
		System.out.println(month);
		
		int rem2 = rem%30;
		System.out.println(rem2);
		
		int week = rem2/7;
		System.out.println(week);
		
		int rem3 = rem2%7;
		System.out.println(rem3);
		
		
//** AND ( & )		
		System.out.println(4&5);
// Bitwise oprators 
// T -> 1 , F -> 0
// AND =  T+T + T 
//8421 
//0100 =4
//0101 =5 // o\p : 4
		System.out.println(8&10);
		
		
// OR ( | )
		
// F+F=F 
		
		System.out.println(7|9);
		System.out.println(3&5);
		System.out.println(8&2|4);
		System.out.println(4*12&2|5);
		
		
		


	}

}
