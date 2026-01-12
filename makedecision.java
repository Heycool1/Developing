import java.util.Scanner;
public class makedecision {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] set = {3, 34, 4, 12, 5, 2};
        System.out.println("Enter Target");
        int a = scanner.nextInt();
        for(int i = 0;i<set.length;i++){
            for(int k = i+1;k< set.length;k++){
                if(set[i]+set[k]==a){
                    System.out.println(set[i]);
                    System.out.println(set[k]);
                }
            }
        }


    }
}
