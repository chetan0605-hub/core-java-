package homework;

import java.util.Scanner;

public class ifelsejuly29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= MENU =========");
        System.out.println("1. Shopping Discount");
        System.out.println("2. Employee Bonus");
        System.out.println("3. Weather Advisory");
        System.out.println("4. Mobile Data Usage");
        System.out.println("5. Exam Eligibility");
        System.out.print("Enter Your Choice (1-5): ");

        int choice = sc.nextInt();

        switch (choice) {

// 1. Shopping Discount
        case 1:
            System.out.print("Enter Bill Amount: ₹");
            double amount = sc.nextDouble();

            double discount = 0;

            if (amount < 1000) {
                discount = 0;
            } else if (amount <= 4999) {
                discount = amount * 0.10;
            } else if (amount <= 9999) {
                discount = amount * 0.20;
            } else {
                discount = amount * 0.30;
            }

            System.out.println("Original Bill : ₹" + amount);
            System.out.println("Discount      : ₹" + discount);
            System.out.println("Final Amount  : ₹" + (amount - discount));
            break;

// 2. Employee Bonus
        case 2:
            System.out.print("Enter Years of Service: ");
            int years = sc.nextInt();

            if (years < 1) {
                System.out.println("No Bonus");
            } else if (years <= 3) {
                System.out.println("Bonus = ₹5000");
            } else if (years <= 6) {
                System.out.println("Bonus = ₹10000");
            } else {
                System.out.println("Bonus = ₹20000");
            }
            break;

        // 3. Weather Advisory
        case 3:
            System.out.print("Enter Temperature: ");
            int temp = sc.nextInt();

            if (temp < 0) {
                System.out.println("Freezing Alert");
            } else if (temp <= 15) {
                System.out.println("Cold Weather");
            } else if (temp <= 25) {
                System.out.println("Pleasant Weather");
            } else if (temp <= 35) {
                System.out.println("Warm Weather");
            } else {
                System.out.println("Heatwave Alert");
            }
            break;

// 4. Mobile Data Usage
        case 4:
            System.out.print("Enter Data Used (GB): ");
            double data = sc.nextDouble();

            if (data < 1) {
                System.out.println("Low Usage");
            } else if (data <= 2) {
                System.out.println("Normal Usage");
            } else if (data <= 3) {
                System.out.println("High Usage");
            } else {
                System.out.println("Data Limit Exceeded");
            }
            break;

// 5. Exam Eligibility
        case 5:
            System.out.print("Enter Attendance Percentage: ");
            double attendance = sc.nextDouble();

            if (attendance >= 75) {
                System.out.println("Eligible for Exam");
            } else if (attendance >= 60) {
                System.out.println("Eligible with Fine");
            } else {
                System.out.println("Not Eligible");
            }
            break;

        default:
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}