import java.util.Scanner;
public class divisirosss {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer");
        int a = scanner.nextInt();
        int count = 0;
        for(int i = 1;i<=a;i++){
            if(a%i == 0){
                count++;

            }

        }
        System.out.println(count);
    }
}
