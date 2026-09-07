package july;
import java.util.Scanner;
public class july28b {

	private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ternary Operator 
//		int a =10;
//		int b =20;
//		int c = (a>b) ? a :b;//? operator
//		System.out.println("max value:"+ c);
		
		
		//Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the no:");
//		int a1=num;
		
		//int num = sc.nextInt();
//		if (a1<35)
//		{
//			System.out.println("fail");
//			
//		}
//		else if (a1<35) {
//			System.out.println("Pass");
//		}
		
//		Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//
//        sc.close();
        
        int k = 100;
        String result=(k>0 && k<35) ? "Fail" :
        	(k>=35 && k<=50) ? "pass class":
        	(k>=51 && k<=60) ? "second class ":
        	(k>=61 && k<=70) ? "first":
        	(k>=71 && k<=100) ? "dist" : "Invalid per";
        System.out.println(result);
        	
  //Traffic Signal (Using Ternary Operator)      
        String signal = "Red";

        String action = (signal.equals("Red")) ? "Stop" :
                        (signal.equals("Yellow")) ? "Get Ready" :
                        (signal.equals("Green")) ? "Go" :
                        "Invalid Signal";

        System.out.println("Signal: " + signal);
        System.out.println("Action: " + action);
		
	
		
	// 5 ternary 
        // if else 
        // task 10 

	}

}
