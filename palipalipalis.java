import java.util.Scanner;
public class palipalipalis {
    public static void main(String[] args){
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i< nums.length;i++){
            if(i % 2 == 0){
                for(int k =0 ; k<nums.length;k++){
                    System.out.print(nums[i][k]);
                }
            }else{
                for(int p = nums.length-1;p>=0;p--){
                    System.out.print(nums[i][p]);
                }
            }
            System.out.println(" ");
        }
    }
}
