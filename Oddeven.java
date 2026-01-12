import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number (-1 for exit)");
            int a = scanner.nextInt();
            if (a== -1){
                break;
            }
            if(a%2== 0){
                System.out.println("Odd");
            }else {
                System.out.println("Even");
            }
        }

    }

}
