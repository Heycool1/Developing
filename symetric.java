import java.util.Scanner;
public class symetric {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int a = scanner.nextInt();
        System.out.println("Enter the second length");
        int b = scanner.nextInt();
        System.out.println(symetricc(a,b));

    }
    public static int symetricc(int a , int b){
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[a][b];
        for(int i = 0 ;i<a;i++){
            for(int k = 0 ; k <b;k++){
                System.out.println("Enter the value");
                nums[i][k] = scanner.nextInt();
            }
        }
        for(int i = 0 ;i<a;i++){
            for(int k = i+1 ; k < b;k++){
                if(nums[k][i] == nums[i][k]){
                    System.out.println("yESS");
                }
            }
        }
        return -1;
    }
}
