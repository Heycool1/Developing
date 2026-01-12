import java.util.Scanner;
public class poratci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num ");
        int a = scanner.nextInt();
        System.out.println("Enter num2");
        int b = scanner.nextInt();

        System.out.println(f(a));
        System.out.println(f(b));

    }
    public static int f(int a){
        if(a>0){
            for(int i = 0; i<a;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        return a;

    }
}
