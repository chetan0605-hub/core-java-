import java.util.Scanner;
public class aug04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = 123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		int num=sc.nextInt();
		//int num=0;
		while (num>0) 
		{
			System.out.println(num%10);
			//123% = 3 
			//12%10=2 
			//1%10=1
			//1/10=0
			num  = num/10;
			//System.out.println(num);

		}
		//System.out.println(num);
	}

}
