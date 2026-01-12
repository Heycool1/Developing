import java.util.Scanner;
public class nedenacaba {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String a = scanner.nextLine();
        String b = a.replace(" ", ".");
        int c = 1;
        for(int i = 0; i<b.length();i++){
            if(b.charAt(i) == '.'){
                c++;
            }
        }
        int d = b.length() / c;
        System.out.println(d);
    }
}
