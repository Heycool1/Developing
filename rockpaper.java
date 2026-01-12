import java.util.Scanner;
import java.util.Random;
public class rockpaper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter int 1 for Rock, 2 for Paper, or 3 for Scissors");
        int a = scanner.nextInt();
        int b = random.nextInt(3) + 1;
        if(a == 1 && b ==2){
            System.out.println("Computer wins");
        }else if(a == 2&& b ==3){
            System.out.println("Computer wins");
        }else if(a == 3 && b == 1){
            System.out.println("Computer wins");
        }else if( a == b){
            System.out.println("Tie");
        }else{
            System.out.println("You Win");
        }
        System.out.println("Your choice : " + a);
        System.out.println("Computers choice : " + b);

    }
}
