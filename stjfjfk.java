import java.util.Scanner;
public class stjfjfk {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("int a");
        int a = scanner.nextInt();
        System.out.println("int b");
        int b = scanner.nextInt();
        System.out.println("int c");
        int c = scanner.nextInt();
        System.out.println("int d");
        int d = scanner.nextInt();
        System.out.println(max(a,b,c,d));

    }
    public static int max(int a,int b, int c,int d){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        if(d>max){
            max = d;
        }

        return max;

    }
}
