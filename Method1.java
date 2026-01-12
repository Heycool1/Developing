import java.util.Scanner;
public class Method1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("hELLO");
        hello();
        int a = iint();
        for(int i = 0;i<=a;i++){
            hello();
        }
    }
    static void hello(){
        System.out.println("Hello");

    }
    static int iint(){
        System.out.println("Enter num");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;

    }
}
