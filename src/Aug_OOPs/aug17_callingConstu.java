package Aug_OOPs;

//
class test7 
{
	// container
	String user;
	String pass;
	test7(String user,String pass) // took data froom object container
	{
		// assign from object to our container (variable) using 
		this.user=user;
		// this keyword are the use for assign the this is global variable
		this.pass=pass;
	}
	test7() 
	// print automatic using constructor 
	{
		this("Kiran","2211");
		// call that const
		//after getting data will print smoothly
		System.out.println(user + " " + pass); // 
	}
	}
public class aug17_callingConstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test7 s1=new test7();
		//user only the call the defualt const always 

	}

}
