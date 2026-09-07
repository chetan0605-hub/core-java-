package Aug;

public class aug02forloop {

    public static void main(String[] args) {

        for (int j = 1; j <= 500; j++) {

            System.out.print("Divisors of " + j + " are : ");

            int c = 0;

            for (int i = 1; i <= j; i++) {

                if (j % i == 0) {

                    System.out.print(i + " ");
                    c++;
                }
            }

            System.out.println(" --> Total count is : " + c);
        }
    }
}