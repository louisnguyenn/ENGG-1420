
package testingproject;

public class TestingProject2 {

    
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader cin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        double s , a, b , S;
        s = 0;
        System.out.print("Enter 1st value: ");
        a = Double.parseDouble(cin.readLine());
        System.out.print("Enter 2nd value: ");
        b = Double.parseDouble(cin.readLine());
        S = a + b;
        System.out.println("The sum is: "+ s);
    }
    
}
