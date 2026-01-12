import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nuMBER ");
        int i = scanner.nextInt();
        while(i<=5){
            System.out.println("Print "+i);
            i++;
        }
        for(i = -3;i<5;i++){
            System.out.println("Hello World");
        }
        int a = 0;
        int b = 10;
        for (i= a;i<b;i++){
            System.out.println("H" +
                    "World");
        }
    }
}
