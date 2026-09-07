package homework;
import java.util.Scanner;
public class july24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Scanner 
		
		Scanner sc=new Scanner(System.in);
		
		int days ;
		System.out.println("Enter the days:");
		
		days=sc.nextInt();
		
		int year = days/365;
	
		System.out.println(year);
		
		int rem = days%365;
		 System.out.println(rem);
		 
		int month = rem/30;
		System.out.println(month);
		
		int rem2 = rem%30;
		System.out.println(rem2);
		
		int weeks = rem2/7;
		System.out.println(weeks);
		
		int rem3= rem2%7;
		System.out.println(rem3);
		
		int hours= rem3/24;
		System.out.println(hours);
		
		int rem4 = rem3%24;
		System.out.println(rem4);
		
		int min = rem4/60;
        System.out.println(min);
        
        int rem5 = rem4%60;
        System.out.println(rem5);
        
        int seco = rem5/60;
        System.out.println(seco);
        System.out.println(seco%60);
        
        
        
		
		
//		int days = rem
		 
//		 int year = days/365;
//			System.out.println(year);
//			
//			int rem = days%365;	
//			System.out.println(rem);
		
		
		

	}

}
