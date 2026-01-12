import java.util.Scanner;
public class triiangelle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter kenar 1");
        int a = scanner.nextInt();
        System.out.println("Enter kenar 2");
        int b = scanner.nextInt();
        System.out.println("Enter kenar 3");
        int c = scanner.nextInt();
        System.out.println(triangless(a,b,c));
    }
    public static String triangless(int a,int b,int c){
        if(c>(a+b) || b>(a+c) || a>(b+c)){
            return "İllegal triangle";
        }else if(a == b && a == c){
            return "equilateral triangle";
        }else if((a == b && c!= a) || (c == b && c!= a) ||( a == c && c!= b)){
            return "isosceles triangle";
        }else{
            return "scalene triangle";
        }
    }
}
