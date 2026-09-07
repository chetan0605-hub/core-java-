package homework;

// Metro class first
class Metro {

	String metroName;
	int totalStations;
	double ticketPrice;
	private String ticket;

	// Default constructor
	Metro() {
		metroName = "Pune Metro";
		totalStations = 10;
		ticketPrice = 20.0;
	}

	// One parameter
	Metro(String name) {
		metroName = name;
		totalStations = 0;
		ticketPrice = 0.0;
	}

	// Two parameters
	Metro(String name, int stations) {
		metroName = name;
		totalStations = stations;
		ticketPrice = 0.0;
	}
	//    void display() 
	//    {
	//    	System.out.println(metroName+""+ticket+" ");
	//    	
	//    }
	//    public String toString () 
	//    {
	//    	return "hello"+metroName;
	//    }

	// Three parameters
	Metro(String name, int stations, double price) {
		metroName = name;
		totalStations = stations;
		ticketPrice = price;
	}
	Metro(Metro ob4) 
	{
		this.metroName=ob4.metroName;
		//totalStations =ob4.stations;


	}

	void display() {
		System.out.println("Metro Name     : " + metroName);
		System.out.println("Total Stations : " + totalStations);
		System.out.println("Ticket Price   : " + ticketPrice);
	}
}


// Main class
public class ConstructorOverloading_metroaug_14 {

	public static void main(String[] args) {

		// Default constructor
		Metro ob1 = new Metro();

		// Constructor with metroName
		Metro ob2 = new Metro("Mumbai Metro");

		// Constructor with metroName and totalStations
		Metro ob3 = new Metro("Delhi Metro", 25);

		// Constructor with all three variables
		Metro ob4 = new Metro("Pune Metro", 30, 40.0);

		Metro ob5  = new Metro(ob4); // -> copy const

		// Display details
		ob1.display();
		ob2.display();
		ob3.display();
		ob4.display();
		//ASystem.out.println(ob5);
		ob5.display();
	}
}






