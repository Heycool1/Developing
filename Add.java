import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter number (-1 for exit): ");
            int b = scanner.nextInt();
            scanner.nextLine();

            if (b == -1) {
                break;
            }

            sum += b;
        }

        System.out.println("Total sum: " + sum);
    }
}