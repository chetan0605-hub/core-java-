package Aug_OOPs;
class test 
{
	// methods ->  1) pre-define -> already define 
	// 2)User -defined -> created the user 
	//                              1) user define non para methods
	//                              2) user define para method
	//                              3) static methods
	//                              4) method overloading........
	//                              5) static method overloading

	// just return the warning 
	//static void get ()
	//	{
	//		System.out.println("get");
	//	}
	//	void show (int a) 
	//	{
	//		System.out.println(a);
	//	}

	// need mandatory object
	//	void show () 
	//	{
	//		System.out.println("show");
	//	}

	// method overloading........
	//	  void get ()
	//		{
	//			System.out.println("get");
	//		}
	//	  void get (int a )
	//		{
	//			System.out.println("first");
	//		}
	//	  void get(float b)
	//		{
	//			System.out.println("sec");
	//		}
	//
	//
	//}
	
	
// static method overloading
	static void get ()
	{
		System.out.println("get");
	}
	static void get (int a )
	{
		System.out.println("first");
	}
	static  void get(float b)
	{
		System.out.println("sec");
	}


}
public class aug_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test t1 = new test();
		//		t1.get();
		//		t1.get();
		//		t1.show(2);
		//		t1.show(4);

		//		t1.get();// using the static methods,because the need the objects.
		//		
		//		test.get();// no need the objects

//		t1.get();
//		t1.get(2);
//		t1.get(2.2f);
		
		test.get();
		test.get(2);
		test.get(2.2f);



	}

}
