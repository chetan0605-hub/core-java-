package july;

import java.util.Scanner;

public class july28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight of clothes: ");
        int num = sc.nextInt();

        //System.out.println("Washing Machine Started");
        if (num ==0) {
        	System.out.println("time estimation is 0");
        }

        else if (num > 0 && num <2000) {
            System.out.println("Estimated Time: 25 Minutes");
        } else if (num >=2001 && num<=4000){
        	System.out.println("Estimated Time: 35 Minutes");
           // System.out.println("Approximately Weight: 2000 g");
        }
        else if (num>=4001 && num == 7000) {
        	System.out.println("Estimated Time: 45 Minutes");
        }
        sc.close();
    }
}

