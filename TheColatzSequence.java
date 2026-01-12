import java.util.Scanner;
public class TheColatzSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer");
        int a = scanner.nextInt();
        while(a != 1){
            if(a % 2 == 0){
                a = a/2;
            }else{
                a = ((a * 3) + 1);
            }
            System.out.println(a);
        }
    }
}
