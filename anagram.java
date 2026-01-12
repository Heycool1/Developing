import java.util.Scanner;
public class anagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string for anagram check");
        String a = scanner.next();
        System.out.println("Enter string for anagram check");
        String b = scanner.next();
        System.out.println(isAnagram(a,b));

    }
    public static boolean isAnagram(String a,String b){
        String c = a.replace(" ","" ).toLowerCase();
        String d = b.replace(" ","" ).toLowerCase();
        if(d.length() != c.length()){
            return false;
        }
        for(int i = 0 ; i< c.length() ;i++){
            char ch =c.charAt(i);
            int index = d.indexOf(ch);
            if (index == -1){
                return false;
            }
        }
        return true;


    }

}
