import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class devam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1");
        String a = scanner.nextLine();
        System.out.println("Enter String 2");
        String b = scanner.nextLine();
        String c ="";
        int len =0;
        if(a.length()>b.length()){
            len = a.length();
        }else{
            len = b.length();
        }
        for(int i = 0; i<len;i++){
            c+= a.charAt(i);
            c+= b.charAt(i);
            }
        System.out.println(c);

    }
}
