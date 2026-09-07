package Aug;

public class aug03forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int j=1;j<=100;j++) {
	int a =0;
	for (int i=1;i<=j;i++) 
	{
		if (j*i==500) 
		{
			a++;
			System.out.println("123");
		}
		else {
			System.out.println("221");
		}
	}
	System.out.println(a);
}
//System.out.println(a);
	}

}
