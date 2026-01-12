import java.util.Scanner;
public class fibo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int c = scanner.nextInt();
        System.out.println(whichfibo(c));
        System.out.println("Enter num which is in array");
        int k = scanner.nextInt();
        System.out.println(inarray(k));


    }
    public static int whichfibo(int c){
        int a = 1;
        int b = 1;
        int p = 1;
        Scanner scanner = new Scanner(System.in);
        for(int i = 1;i<c-1;i++){
            p= a + b;
            a = b;
            b = p;

        }
        return p;
    }
    public static boolean inarray(int k){
        int a = 1;
        int b = 1;
        int p = 1;
        Scanner scanner = new Scanner(System.in);
        while(true){
            p= a + b;
            a = b;
            b = p;
            if (p == k){
                return true;
            }else if( p> k){
                return false;
            }

        }


    }
}
