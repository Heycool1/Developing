import java.util.Scanner;
public class kafayıyedim {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int a = scanner.nextInt();
        System.out.println("Enter the second length");
        int b = scanner.nextInt();
        System.out.println(diagonal(a,b));

    }
    public static int diagonal(int a , int b){
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[a][b];
        for(int i = 0 ;i<a;i++){
            for(int k = 0 ; k <b;k++){
                System.out.println("Enter the value");
                nums[i][k] = scanner.nextInt();
            }
        }
        for(int i = 0 ;i<a;i++){
            for(int k = 0 ; k <b;k++){
                if(k == i){
                    System.out.println(nums[i][k]);
                }
            }
        }
        return -1;
    }
}
