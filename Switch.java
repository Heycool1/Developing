import java.util.Scanner;
import java.util.Random;
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day as a number ");
        int gun = scanner.nextInt();
        switch (gun){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Wrong Choice");
                break;
            }

    }
}
