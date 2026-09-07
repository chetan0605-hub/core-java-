package Aug_OOPs;
 class method {
 int add (int a,int b ) 
 {
	 return a +b;
 }
 byte mul(byte a , byte b) 
 {
	 return (byte)(a*b);
 }
 
 //String 
 String sub (short a,short b) 
 {
	 return "sub="+ (a-b);
 }
 
 }
public class aug14_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method s1=new method();
		int x =s1.add(10,20);
		System.out.println("add= "+x);
		byte y=s1.mul((byte)2,(byte)4);
		System.out.println("mul= "+y);
		
		// using the String 
		String z=s1.sub((short)40, (short)20);
		System.out.println(z);
				

	}

}
