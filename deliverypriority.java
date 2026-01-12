import java.util.Scanner;
public class deliverypriority {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        int a = scanner.nextInt();
        System.out.println("Enter Distance");
        int b = scanner.nextInt();
        System.out.println("Is fragile 1/0");
        int c = scanner.nextInt();
        if((a>10 && b >500)|| (c == 1)){
            System.out.println("HIGH");
        }else if((a>5 && a<10)|| (b<500 && b>100)){
            System.out.println("MEDIUM");
        }else{
            System.out.println("LOW");
        }

    }
}
