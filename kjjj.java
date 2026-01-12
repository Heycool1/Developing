import java.util.Scanner;
public class kjjj {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to get factorial");
        int a = scanner.nextInt();
        System.out.println("NUM2 ");
        int b = scanner.nextInt();
        System.out.println(factorial(a));
        System.out.println(factorial(b));


    }
    public static int factorial(int a){
        int fact =1;
        for(int i = 1;i<a+1;i++){
            fact *= i;
        }
        return  fact;
    }
}
