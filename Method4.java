import java.util.Scanner;
public class Method4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        min(a,b);


    }
    static void min(int a , int b){
        if (a>b){
            System.out.println(b);
        }else if (a<b){
            System.out.println(a);
        }else if (a==b){
            System.out.println("They are same");
        }

    }
}
