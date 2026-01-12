import java.util.Scanner;
public class IfPositiveLoopPyramite {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer");
        int a = scanner.nextInt();
        if (a<=0){
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        for(int i = 0 ; i<=a;i++){
            for(int k = 0; k<i;k++) {
                System.out.print(i);
            }
            System.out.println(" ");

        }

    }
}
