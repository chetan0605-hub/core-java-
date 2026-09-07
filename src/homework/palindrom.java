package homework;

public class palindrom {

    public static void main(String[] args) {

        int a = 111;

        int temp = a;
        int rev = 0;

        while (a > 0) {

            int num = a % 10;

            rev = rev * 10 + num;

            a = a / 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome: " + rev);
        } else {
            System.out.println("Not Palindrome");
        }
    }
}