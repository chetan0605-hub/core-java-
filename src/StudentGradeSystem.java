import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double percentage = total / 5.0;

        char grade;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else if (percentage >= 40)
            grade = 'E';
        else
            grade = 'F';

        System.out.println("\n------ RESULT ------");
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Highest     : " + highest);
        System.out.println("Lowest      : " + lowest);
        System.out.println("Grade       : " + grade);

        sc.close();
    }
}