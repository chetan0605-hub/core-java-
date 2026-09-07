package july;

public class typeCasting extends july23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// widening
		int n = 20;
		long x = n;
		
        System.out.println(x);
//        
//        
//        // narrowing
//        
        long n2 = 20;
        int x2=(int)n2;
        
        System.out.println(x2);
        
        double a =30;	
        float b = (float) a;
        
        System.out.println(b);
        System.out.println(a);
        
        short c=(short) n2;	
        int  k=(int) n2;
        
        System.out.println(c);
        System.out.println(k);
//        
//        //boolean 
//        
//        int p = 20;
// **boolean p2=p; cannot from int t boolean
//**booleann p2=(int)p; // cannot covert from int to boolean      
//** We cannot covert boolean type into other primitive type . vice versa no type casting primitive type value into boolean
        
        
        
// char
         char ch='A';
         int cha=ch;
         System.out.println(c);
         
         int c2 = 65;
         char ch2 =(char) c2;
         System.out.println(c2);
         System.out.println(ch2);
//         
         
//string
         	int s = 30;
         	//String s2=s;
         	
         	
         	long s2 = s;
         	System.out.println(s);
         	
            String s3 = "1000";
            int s4=Integer.parseInt(s3);
            
            
             String k1 = "20",k2="30";
             
             System.out.println(k1+k2);
             
//String -> int
             
             
             int h = 50;
             String ans=String.valueOf(h);
             System.out.println(ans+10);
             System.out.println(h);
             
             
             float f = 45.66f;
             String ans2=String.valueOf(f);
             System.out.println(f);
             
             
             double g  =1000.000d;
             String ans3=String.valueOf(g);
             System.out.println(g);
             
             
             
             
             

         
         
         
         
  
        
        
        
        
	}

}
