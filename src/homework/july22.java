package homework;

import java.util.Scanner;

public class july22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
// TASK 01****************

 // ================= Employee Details =================

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Is Permanent (true/false): ");
        boolean isPermanent = sc.nextBoolean();
// TASK 02 *********************
        
// Display Employee Details
        System.out.println("\n========== Employee Details ==========");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Age              : " + age);
        System.out.println("Salary           : " + salary);
        System.out.println("Gender           : " + gender);
        System.out.println("Is Permanent     : " + isPermanent);

// ================= Account Details =================

        System.out.print("\nEnter Account Number: ");
        long accountNumber = sc.nextLong();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        // Display Account Details
        System.out.println("\n========== Account Details ==========");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Deposit Amount : " + depositAmount);
// TASK 03 ******************

        // ================= Travel Booking =================

        sc.nextLine(); // Consume newline

        System.out.print("\nEnter Passenger Name: ");
        String passengerName = sc.nextLine();

        System.out.print("Enter Age: ");
        int age1 = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Is Ticket Confirmed (true/false): ");
        boolean isTicketConfirmed = sc.nextBoolean();

// Display Passenger Details
        System.out.println("\n========== Travel Booking Details ==========");
        System.out.println("Passenger Name   : " + passengerName);
        System.out.println("Age              : " + age1);
        System.out.println("Destination      : " + destination);
        System.out.println("Ticket Confirmed : " + isTicketConfirmed);

        // Close Scanner only once
        sc.close();
    }
}