import java.util.Scanner;

public class Method5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();

        int sum = factorial(a);
        System.out.println("Factorial of " + a + " = " + sum);
    }

    static int factorial(int a){
        int product = 1;

        for(int i = a; i >= 1; i--){
            product *= i;
        }

        return product;
    }
}