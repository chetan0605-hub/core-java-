package Aug_OOPs;

// method call in the one methods 
class sum {
	
	void get() 
	{
		System.out.println("get");
	}
	void set() 
	{
		get();
		System.out.println("set");
		
	}
	void show() 
	
	{
		set(); // call all
		System.out.println("show");
	}

}
public class aug14_methodsamecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s1=new sum();
		s1.show(); // call all 
		

	}

}
