public class matriss {
    public static void main(String[] args){
        int[][] nums = {{1,2,3},{4,5,6}};
        for(int i = 0; i < nums[0].length ; i++) {
            for(int k = 0;k<nums.length;k++){
                System.out.print(nums[k][i]);
            }
            System.out.println(" ");
        }
    }
}
