package Aug_OOPs;
class calci 
{
	
	int add (int a ,int b) 
	{
		int c=a+b;
		return c;
	}
	float mul(float a, float b) 
	{
		return a*b;
	}
	double sub (double a,double b) 
	{
		return a-b;
	}
	
	int div (int e , int r) 
	{
		return e-r;
	}
	int mod(int s ,int d) 
	{
		return s%d;
	}
}

public class aug13_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calci c1 = new calci();
		System.out.println(c1.add(10 ,20));
		float x=c1.mul(1.2f,2.2f);
		System.out.println(x);
		double a=c1.sub(10,20);
		System.out.println(a);
		int b=c1.div(10, 20);
		System.out.println(b);
		int c= c1.mod(100, 10);
		System.out.println(c);
		
		
		
		

			}

}
