import java.util.Scanner;

public class vowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String for check");
        String b = scanner.next();

        System.out.println(vowels(b));
    }

    public static boolean vowels(String b){
        char[] a = {'a','e','ı','i','o','ö','u','ü'};
        int count1 = 0; // vowel
        int count2 = 0; // consonant

        for(int i = 0; i < b.length(); i++){
            char ch = Character.toLowerCase(b.charAt(i));
            boolean isVowel = false;

            for(int k = 0; k < a.length; k++){
                if(ch == a[k]){
                    isVowel = true;
                    break;
                }
            }

            if(isVowel){
                count1++;
            } else {
                count2++;
            }
        }

        return count1 >= count2;
    }
}