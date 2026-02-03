package Assignments.A2;
import java.util.Scanner;

public class A2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = -1;
        int sum = 0;
        
        System.out.println("Enter numbers (0 to exit):");
        while (num != 0)
        {
            if (num == 0)
            {
                break;
            }

            num = scanner.nextInt();

            sum += num;
        }
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
