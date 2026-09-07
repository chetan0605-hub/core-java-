package july;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num;
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter No:");
       num = sc.nextInt();
        // positive negative  zero 
       // even odd
       //7
       
       if (num>0)
       {
    	   System.out.println("P");
    	   //even odd
    	   if (num%2==0) 
    	   {
    		   System.out.println("even");
    	   }
    		   
       }
       else if(num<0)
       {
    	   System.out.println("N");
       }
       else
       {
    	   System.out.println("Zero");
    	   
       }
       
	}

}
