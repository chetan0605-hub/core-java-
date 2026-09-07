package Aug_OOPs;

import java.util.Scanner;

class Circle {

    void areaOfCircle(int r) {
        System.out.println("area of circle is : " + (3.14 * r * r));
    }
}

public class aug12_areaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius of circle:");
        int r = sc.nextInt();

        Circle ob = new Circle();

        ob.areaOfCircle(r);

        sc.close();
    }
}