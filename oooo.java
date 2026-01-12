import java.util.Scanner;
public class oooo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String ");
        String a = scanner.nextLine();
        String b = a.toLowerCase();
        for(int i = 1;i<a.length();i++){
            if(b.charAt(i)-b.charAt(i-1)==1){
                System.out.println(b.substring(i-1,i+1));
            }
        }
    }
}
