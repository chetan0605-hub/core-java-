package Aug_OOPs;

//import java.util.Scanner;

class emp 
{
	String name;
	String add;
	int salary;
	float exp;
	emp(String name,String add,int salary,float exp) 
	{
	this.name=name;
	this.add=add;
	this.salary=salary;
	this.exp=exp;
	
	//System.out.println(name);
	
	}
//	void show() 
//	{
//		String name="kiran";
//		int salary=10000;
//	}
	emp() 
	{
		this("Kiran","pune",75000,1.5f);
		System.out.println(name + ","+ add + "," +salary+","+exp);
	}
	}
public class aug17_taskCnstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp s1=new emp();
		//Scanner c1= new Scanner(System.in);
		s1.show();
		
		

	}

}
