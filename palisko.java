import java.util.Scanner;
public class palisko {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value");
        String a = scanner.next();
        System.out.println(isPalindrom(a));

    }
    public static String isPalindrom(String a){
        String c = "";
        for(int i = a.length()-1; i>=0;i--){
            c += a.charAt(i);
        }
        if (a.equals(c)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");

        }
        return c;



    }
}
