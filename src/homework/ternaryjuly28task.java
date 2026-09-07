package homework;

public class ternaryjuly28task {
// Task no 01 : age group
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int age = 20;
		 String result= (age>=0 && age<=15) ? "child":
			 (age>=16 && age<=21) ? "Teen":
			 (age>=22 && age<=40) ? "Adult":
			 (age >=41 && age<=60) ? "Senior" : "Invoid";
		 System.out.println(result);
		 
		
		 
// Task no 02 : ATM 
		
		int amount = 1500;

		String result1 = (amount <= 0) ? "No Balance" :
		                 (amount <= 2000) ? "Transaction Successful" :
		                 (amount <= 50000) ? "Additional Verification Required" :
		                 "Withdrawal Limit Exceeded";

		System.out.println(result1);
	
		
// Task No 03 : Electricity Bill
		int units = 200;

		int bill = (units <= 100) ? units * 1 :
		           (units <= 200) ? units * 2 :
		           (units <= 300) ? units * 3 :
		           units * 5;

		System.out.println("Total Bill = ₹" + bill);
		
		
// Task No 04: 
		
		 String signal = "Red";

	        String result3 = (signal.equalsIgnoreCase("Red")) ? "Stop" :
	                        (signal.equalsIgnoreCase("Yellow")) ? "Get Ready" :
	                        (signal.equalsIgnoreCase("Green")) ? "Go" :
	                        "Invalid Signal";

	        System.out.println("Signal : " + signal);
	        System.out.println("Action : " + result3);
	
// Task No 05:. Movie Ticket	   
	        int age2 = 25;

	        String ticket = (age2 < 5) ? "Free Ticket" :
	                        (age2<= 12) ? "Ticket Price = ₹100" :
	                        (age2<= 59) ? "Ticket Price = ₹200" :
	                                      "Ticket Price = ₹120";

	        System.out.println("Age : " + age2);
	        System.out.println(ticket);

	        
	}
	

}
