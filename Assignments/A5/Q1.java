import java.util.Scanner;

public class Q1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        int count = 1;

        System.out.println("Enter string: ");
        String input_string = scanner.nextLine();
//        System.out.println("String: " + input_string);

        for (int i = 0; i < input_string.length() - 1; i++) {
            if (input_string.charAt(i) == input_string.charAt(i + 1)) {
                count += 1;
            } else {
                res.append(input_string.charAt(i));
                if (count != 1) {
                    res.append(count);
                }
                count = 1;
            }
        }

        res.append(input_string.charAt(input_string.length() - 1));
        if (count != 1) {
            res.append(count);
        }

        System.out.println(res);
        scanner.close();
    }
}
