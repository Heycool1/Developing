import java.util.Scanner;
public class reokajce {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String a = scanner.nextLine();
        System.out.println("Enter Char");
        char b = scanner.next().charAt(0);
        System.out.println(a.replace(String.valueOf(b)," "));
    }
}
