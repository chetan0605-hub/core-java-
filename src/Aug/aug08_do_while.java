package Aug;

public class aug08_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		do
		{
			System.out.println("hello");
			i++;
		}while(i<=5);
		System.out.println("----------print 1 to 10--------------");


		int a=1;
		do 
		{
			System.out.println(a);
			a++;

		}while (a<=10);


		System.out.println("-------10 to 1 -------------");	
		int a1=10;
		do 
		{
			System.out.println(a1);
			a1--;

		}while (a1>=1);

		System.out.println("----------sum of 1 to 10--------------");
		int num=0;
		int b=1;
int sum =0;

		do 
		{
			sum = sum + b;

			//int c1= num+b;	
			//System.out.println(c1);
			//int c1= num+b;
			b++;
		}while(b<=10);
		System.out.println(b);
		System.out.println("----------fcatorial of 5 -----------");
		
		//int g=5;
		int k=1;
		int fact=1;
		do 
		{


			fact = fact * k;
			k++;
		}while(k<=5);
		System.out.println(fact);
	}

}
