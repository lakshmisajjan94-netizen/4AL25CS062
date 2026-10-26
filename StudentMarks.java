import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter marks for Student " + i);

            System.out.print("Subject 1: ");
            int m1 = sc.nextInt();

            System.out.print("Subject 2: ");
            int m2 = sc.nextInt();

            System.out.print("Subject 3: ");
            int m3 = sc.nextInt();

            int total = m1 + m2 + m3;

            System.out.println("Total marks of Student " + i + " = " + total);
            System.out.println("----------------------");
        }

        sc.close();
    }
}