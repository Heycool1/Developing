import java.util.Scanner;
public class secondalargetto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int a = scanner.nextInt();
        int[] nums = new int[a];
        for(int i = 0 ; i<a;i++){
            System.out.println("Enter num");
            nums[i] = scanner.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ; i<a;i++ ){
            if(nums[i]>max){
                second = max;
                max = nums[i];

            }else if(nums[i]>second && max>nums[i]){
                second = nums[i];
            }
        }
        System.out.println(second);




    }
}
