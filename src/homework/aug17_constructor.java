package homework;

import java.util.Scanner;

class kiran {

    String name;
    int rollno;
    long mobialno;
    double salary;
    float exp;
    char gender;

    // Parameterized Constructor
    kiran(String name, int rollno, long mobialno,
          double salary, float exp, char gender) {

        this.name = name;
        this.rollno = rollno;
        this.mobialno = mobialno;
        this.salary = salary;
        this.exp = exp;
        this.gender = gender;
    }

    // Default Constructor
    kiran() {

        //this("kiran", 60, 787502454L, 50000.00, 1.5f, 'm');

        System.out.println(name);
        System.out.println(rollno);
        System.out.println(mobialno);
        System.out.println(salary);
        System.out.println(exp);
        System.out.println(gender);
    }
}

public class aug17_constructor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name=sc.nextLine();

        System.out.print("Enter Roll No : ");
        int rollno = sc.nextInt();

        System.out.print("Enter Mobile No : ");
        long mobile = sc.nextLong();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        System.out.print("Enter Experience : ");
        float exp = sc.nextFloat();

        System.out.print("Enter Gender : ");
        char gender = sc.next().charAt(0);

        // User input → Parameterized Constructor
        kiran k1 = new kiran(name, rollno, mobile, salary, exp, gender);

        System.out.println("\n----- Student Details -----");
        System.out.println("Name : " + k1.name);
        System.out.println("Roll No : " + k1.rollno);
        System.out.println("Mobile No : " + k1.mobialno);
        System.out.println("Salary : " + k1.salary);
        System.out.println("Experience : " + k1.exp);
        System.out.println("Gender : " + k1.gender);

        sc.close();
    }
}