import java.util.Scanner;
public class oddevenpos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer");
        int a = scanner.nextInt();
        if (a == 0){
            System.out.println("0 is neither positive nor negative.");
        }else{
            if(a>0){
                if(a%2 ==0){
                    System.out.println(a + " is positive and even");

                }else{
                    System.out.println(a + " is positive and odd");
                }
            }else{
                if(a%2 ==0){
                    System.out.println(a + " is negative and even");

                }else{
                    System.out.println(a + " is negative and odd");
                }

            }
        }
    }
}
