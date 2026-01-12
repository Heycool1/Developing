import java.util.Scanner;
public class hexxohello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = scanner.next();
        System.out.println("Enter char 1");
        char char1 = scanner.next().charAt(0);
        System.out.println("Enter char 2");
        char char2 = scanner.next().charAt(0);
        System.out.println(a.replace(char1,char2));


    }
}
