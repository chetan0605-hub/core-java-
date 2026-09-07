package july;
import java.util.*;
public class july29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the days No:");
		int dayno=sc.nextInt();
		
		 switch (dayno) {
		 case 1:System.out.println("Sunday"); break;
		 case 2:System.out.println("Monday"); break;
		 case 3:System.out.println("Tuesday"); break;
		 case 4:System.out.println("Wednesday"); break;
		 case 5:System.out.println("thursday"); break;
		 case 6:System.out.println("Friday"); break;
		 case 7:System.out.println("Saturday"); break;
		 case 8:System.out.println("Invalid");
		 }
		 
// char testing
		 // vowel - a e i o u
		 // char ch=sc.next(). ChartAT (0);
		 // char ch = Character.toLowerCASE(ch);
		 //OR 
		 System.out.println("Enter the char:");
		 
		
		 char ch=sc.next().toLowerCase().charAt(0);
		 
		 switch (ch)
		 {
		 case 'a':
		 case 'e':
		 case 'u':
		 case 'i':
		 case 'o':
			 System.out.println("its vowel") ; break;
			 default : System.out.println("Not vowel");
			 
		 }
		 
		 // case student name 
		 
		 
		 System.out.println("Enter the student name :");
		 String name = sc.next().substring(ch);
				 
	}
	

}
