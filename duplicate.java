import java.util.Scanner;
public class duplicate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] nums = new int[a];
        for(int i = 0;i<a;i++){
            System.out.println("Enter a value for array");
            nums[i]= scanner.nextInt();
        }
        for(int k = 0; k<a;k++){
            for(int p = k+1;p<a;p++){
                if(nums[k]==nums[p]){
                    int x = nums[k];
                    System.out.println(x);
                    return;
                }
            }

        }

    }
}
