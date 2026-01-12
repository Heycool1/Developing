import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String a = scanner.next();
        System.out.println(switchcase(a));

    }
    public static String switchcase(String a) {
        String c = "";

        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            char ch2 = a.toLowerCase().charAt(i);
            if (ch1 == ch2) {
                c+= a.toUpperCase().charAt(i);
            }else{
                c+= a.toLowerCase().charAt(i);
            }

        }
        return c;
    }
}
