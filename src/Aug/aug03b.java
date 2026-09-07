package Aug;

public class aug03b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int j=1;j<=100;j++) 
		{
			int c = 0;

			for (int i=1;i<=j;i++) 
			{
				if(j%i==0) 
				{
					c++;
					//System.out.println("cout is :" + c);
				}
				//System.out.println("cout is :" + c);
			}
			if (c==2) 
			{
				//System.out.println("prime no :" +j);

				if (c%2==0) 
				{
					System.out.println(" its is a prime number is :"+ j );
				}
			}
		}

		// System.out.println("prime is");
	}

}
