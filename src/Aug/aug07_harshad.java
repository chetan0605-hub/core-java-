package Aug;

public class aug07_harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=177;
		int rem=num;
		int sum=0;
		
		while (num>0) 
		{  //int temp;
			rem = num%10;
			sum = sum +rem;
			num = num/10;
			
		}
		System.out.println(num);
		System.out.println(sum);
		if(rem % sum ==0) 
		{
			System.out.println("harshad number");
		}
		else 
		{
			System.out.println("not harshad no");
		}
		

	}}	