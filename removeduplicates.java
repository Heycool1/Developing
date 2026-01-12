import java.util.Scanner;
public class removeduplicates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String a = scanner.next();
        System.out.println(removeduplicates(a));

    }
    public static String removeduplicates(String a){
        String result = "";
        for(int i = 0 ;i<a.length();i++){
            char ch = a.charAt(i);
            for(int k = 1;k<a.length();k++){
                int j = a.indexOf(ch);
                if(result.indexOf(ch) == -1){
                    result = result + ch;


                }
            }


        }
        return result   ;

    }
}
