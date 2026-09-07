package july;
import java.util.Scanner;
public class switch30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		// float per = 2500f
		System.out.println("Menu:\n.Check pass/fail" 
				+ "\n2.Find odd/even"+"\nEnter your choice ?");
		int choice = sc.nextInt();
		switch(choice) 
		 
		case 1 : System.out.println("ENter the per:");
		float per = sc.nextFloat();
		
		if (per<35)
		 {
			 System.out.println("fail");
		 }
		
		else {
			System.out.println("pass");
		}
		break; 
		
		

	}
	}

