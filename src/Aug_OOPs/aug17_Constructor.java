package Aug_OOPs;
class car 
{
	String name;
	car()
	{
		//this ("scoda");
		System.out.println("Hello i am kiran...............");

	}
	car(String name) 
	{
		this();
		this.name=name;
	}
	void display() 
	{
		System.out.println(name);
		this.show();
	}
	void show() 
	{
		System.out.println("hey...........!");
	}
}
public class aug17_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car s1= new car("kakade");
		s1.display();


	}

} 
