import java.util.Scanner;
public class exexe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String a = scanner.nextLine();
        System.out.println("Enter num1");
        int b = scanner.nextInt();
        System.out.println("Enter num2");
        int c = scanner.nextInt();
        String newword = "";
        for(int i = 0;i<a.length();i++){
            if(i==b){
                newword += a.charAt(c);
            }else if(i==c){
                newword +=a.charAt(b);
            }else{
                newword +=a.charAt(i);
            }

        }
        System.out.println(newword);
    }
}
