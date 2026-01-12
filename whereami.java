import java.util.Scanner;
public class whereami {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String a = scanner.next();
        System.out.println(whereisit(a));

    }
    public static String whereisit(String a){
        String[] fruits = {"apple","jfjajf","apple","apple","naber","iyidir","apple"};
        for(int i = 0;i< fruits.length;i++){
            if(a.equals(fruits[i])){
                System.out.println(i);
            }
        }

        return "there isnt";


    }
}
