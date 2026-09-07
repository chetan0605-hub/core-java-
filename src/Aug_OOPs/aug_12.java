package Aug_OOPs;
class demo 
{
	int a ;
	String name;
}// CLASS no memory

public class aug_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		demo d1 =new demo();//heap
		//		System.out.println(System.identityHashCode(d1));
		//		demo d2 =new demo();//heap
		//		System.out.println(System.identityHashCode(d2));

		//		String s1=new String("KIRAN");
		//		System.out.println(s1.hashCode()); // chnage to content wise
		//		System.out.println(System.identityHashCode(s1));
		//		
		//		
		//		String s2=new String("KIRAN");
		//		System.out.println(s2.hashCode());
		//		System.out.println(System.identityHashCode(s2));


		demo d1 =new demo();
		d1.a=100;
		d1.name="kiran";
		System.out.println(d1.a +" "+d1.name);

		demo d2 =new demo();
		d2.a=200;
		d2.name="kakade";
		System.out.println(d2.a + " " +d2.name);


		demo d3 =new demo();
		d3.a=300;
		d3.name="abcd";
		System.out.println(d3.a + " " +d3.name);


		//		calci c1=new calci();
		//		c1.a=10;
		//		c1.b=20;
		//		System.out.println( "add =" +(c1.a+c1.b));
		//		calci c2=new calci();
		//		c2.a=30;
		//		c2.b=40;
		//		System.out.println("sub ="+(c2.a-c2.b));
		//		calci c3=new calci();
		//		 c3.a=50;
		//		 c3.b=60;
		//		 System.out.println("multiply =" +(c3.a*c3.b));


		new calci();
		System.out.println(new calci().a);
		System.out.println(new calci ().b);


		calci c1=new calci();
		System.out.println(c1.a);
		System.out.println(c1.b);



	}
}


