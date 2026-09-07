package Aug;

public class aug01c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		int c= 0;
		for (int i=1;i<num;i++)
		{
			if (num%i==0)

			{
				c++;
				System.out.println(i);
			}

		}
		System.out.println("count = " + c);
		if (c==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime ");
		}

	}
}
