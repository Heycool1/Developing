import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int a = scanner.nextInt();
        System.out.println(largestSum(a));

    }
    public static int largestSum(int a){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <=a ; i++){
            int count = 0;
            for(int k = i; k>0;k--){
                System.out.print(k);
                count+=k;
            }
            System.out.println(" ");
            if(count > max){
                max = count;
            }
        }
        System.out.println(max);
        return -1;


    }
}
