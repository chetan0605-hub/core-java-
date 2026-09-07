package Aug;

class student  // created a class beacuse copy for the class main ;
{

	int studid;
	String studenm;
	//System.out.println("helloo");

	void method1 () // return method 
	{
		System.out.println(studid+""+studid);
	}
}
class fees_info // class no 2..;
{
	float collegefees;
	String payment_type;
	
	void method2 () 
	{
		System.out.println(collegefees+ " " + collegefees);
	}

}

public class aug11_oopbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student ob1=new student();
		fees_info ob2=new fees_info();
		ob1.method1();

	}

}
