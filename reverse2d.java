public class reverse2d {
    public static void main(String[] args){
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = nums.length-1; i>=0;i--){
            for(int k = nums[0].length-1 ; k>=0;k--) {
                System.out.print(nums[i][k] + " ");
            }
            System.out.println();
        }
    }
}
