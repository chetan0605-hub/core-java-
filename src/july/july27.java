package july;
import java.util.*;
public class july27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Bitwise OR (||) 
		boolean Gap = false; // no gap 
		float per =45.00f;
		String skill ="java";
		
		if  (!(Gap==false || per >60 && skill =="java")) 
		{
			System.out.println("You are elegible to apply");
			
		}
		else 
		{
			System.out.println("Not elegible to apply");
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color:");
		
		
		String color=sc.next();
		
		if (color.equals("Red" )|| color.equals("RED")  || color.equals("red")){
			System.out.println("STOP");
		}
		else  if(color.equals("Yellow" )|| color.equals("YELLOW")  || color.equals("yellow")){
			System.out.println("wait/pause");
		}	
		else if (color.equals("Green" )|| color.equals("GREEN")  || color.equals("green"))
				{
			System.out.println(" Go");
				}
		
		else {
			System.out.println("wrong color");
		}
		if(color.equalsIgnoreCase("red"))
		{
			System.out.println("STOP");
		}
		else if(color.equalsIgnoreCase("Yellow")) {
			System.out.println("wait/pause");
		}
		else if (color.equalsIgnoreCase("Green"))
		{
			System.out.println("Go");
		}
		
//vowel		
// a e  i o u 
// A E I O U 
		
//		char ch ='a';//sc.next()>charAt(0)
//		ch=Character.toLowerCase(ch);
//		if (ch=='a' || ch=='e'  || ch=='i' || ch=='o' || ch=='u' )
//		{
//			System.out.println("Its vowels ");
//			
//		}
//		else {
//			System.out.println("Not vowels");
		
		char ch ='A';
		ch= Character.toUpperCase(ch);
		if (ch=='a' || ch=='B'  || ch=='I' || ch=='O' || ch=='U' )
		{
			System.out.println("Its vowels ");
			
		}
		else {
			System.out.println("Not vowels");
		}
		
//Password checking 	
		Scanner sc1=new  Scanner(System.in);
		System.out.println("Enter the No:");
		
		String pass =sc1.next();
		if (pass.length()>=8) {
			System.out.println("password length valid ");
			
			
		}
		
		else {
			System.out.println("lenght should be >8");
		}
		System.out.println("Enter the Email:");
	    String email=sc.nextLine();
	    System.out.println("Enter the password:");
	    String pass1=sc.next();
	    if (email.equalsIgnoreCase("kakadekiran@gmail.com") && pass1.equalsIgnoreCase(null))
	    {
	    	System.out.println("login Successful:");
	    	
	    }
	    else
	    {
	    	System.out.println("checks Credintials:");
	    }
	    
	}

}
