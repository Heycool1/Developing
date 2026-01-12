import java.util.Locale;

public class StringComparsionandSubstring {
    public static void main(String[] args){
        String WordA = "HelloWorld";
        String WordB= "helloworld";
        System.out.println(WordA.equals(WordB));
        System.out.println(WordA.toLowerCase(Locale.ROOT).equals(WordB.toLowerCase()));
        System.out.println(WordA.substring(0,5));
        System.out.println(WordA.contains("Wo"));
        System.out.println(WordB.contains("Wo"));
    }
}
