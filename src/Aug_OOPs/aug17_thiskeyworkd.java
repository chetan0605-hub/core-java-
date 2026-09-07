package Aug_OOPs;
class test6 {
	int n;
	String name;
	float marks;
	String addr;
	test6(int n,String name,float marks ,String addr) 
	{
		this.n=n;// this keyword are globle showing .
		this.name=name;
		this.marks=marks;
		this.addr=addr;
	}
	void show() 
	{
		System.out.println(n + " " +name +"" +marks+""+addr);
	}
}
public class aug17_thiskeyworkd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6 s1 = new test6(2, "kiran", 50, "pune");
		s1.show();

	}

}
