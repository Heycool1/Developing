import java.util.Scanner;
public class newwone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string a");
        String a = scanner.next();
        System.out.println("Enter string b");
        String b = scanner.next();
        System.out.println(first(a,b));
        System.out.println(second(a,b));

    }
    public static int first(String a , String b){
        int count = 0;
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(b.indexOf(ch) != -1){
                count++;
            }


        }
        return count;
    }
    public static boolean second(String a , String b){
        int count =first(a,b);
        if(count == a.length() -1){
            return true;
        }
        return false;

    }
}
