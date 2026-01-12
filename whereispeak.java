import java.util.Scanner;
public class whereispeak {
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int peak= Integer.MIN_VALUE;
        int count = 0;
        int[] nums = {1,2,3,4,5,6,7,23,5,4,3,2};
        for(int i = 0;i< nums.length;i++){
            if(nums[i]>max){
                peak = max;
                max = nums[i];
            }else if(nums[i]<max){
                System.out.println(i-1);
                System.out.println(nums[i-1]);
                break;

            }

        }
    }
}
