package homework;

public class aug05_posnegno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int rem;
		if(num>0) {
			System.out.println("Positive");
			while(num>0)
			{
				rem = num%10;
				if(rem%2==0) 
				{
					System.out.println(rem);
					//prime
					int c=0;
					for(int i=1;i<=rem;i++)
					{
						if(rem%i==0)
						{
							c++;
						}
					}
					if(c==2)
					{
						System.out.println("Prime = " + rem);
					}
				}
				num = num/10;
			}
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("zero");
		}

	}

}
