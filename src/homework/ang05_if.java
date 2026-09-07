package homework;

public class ang05_if {
	public static void main(String[] args) 
	{

		int num = 123456;

		if (num > 0)
		{
		    System.out.println("Positive");

		    while (num > 0)
		    {
		        int rem = num % 10;

		        // Even Check
		        if (rem % 2 == 0)
		        {
		            // Prime Check
		            int count = 0;

		            for (int i = 1; i <= rem; i++)
		            {
		                if (rem % i == 0)
		                {
		                    count++;
		                }
		            }

		            // Print only if Even + Prime
		            if (count == 2)
		            {
		                System.out.println(rem);
		            }
		        }

		        num = num / 10;
		    }
		}
		else if (num < 0)
		{
		    System.out.println("Negative");
		}
		else
		{
		    System.out.println("Zero");
		}

	}

}
