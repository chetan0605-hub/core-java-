package Aug_OOPs;
class student 
{
	int b;
	String n;
	String x;
	float m;
	void get (int a,String name,float marks,String addr)
	{
		b=a;
		n=name;
		m=marks;
		x=addr;
	}
	void set () 
	{
		get(1,"abc",35,"pune");
		
			
		System.out.println(b);
		System.out.println(n);
		System.out.println(m);

		System.out.println(x);



	}
	}
public class aug14_localtglobvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		s1.set();

	}

}
