import java.util.Scanner;
public class easyy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String a = scanner.nextLine();
        String b = a.toLowerCase();
        System.out.println("Enter char");
        char c = scanner.next().charAt(0);

        for(int i = 0 ; i<b.length();i++){
            if(b.charAt(i)==c){
                System.out.println(i);

            }
        }
    }
}
