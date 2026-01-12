import java.util.Scanner;
public class Midtermcalisma2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        if(a>0 && a%2 == 0){
            System.out.println("It is Positive even");
        }else if (a>0){
            System.out.println("It is positive odd");
        }else if (a%2 == 0){
            System.out.println("It is negative even");
        }else {
            System.out.println("It is negative odd");
        }
    }
}
