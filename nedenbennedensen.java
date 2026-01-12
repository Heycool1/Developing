public class nedenbennedensen {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int product = 1;
        for(int i = 0 ; i <nums.length;i++){
            product *= nums[i];
        }
        for(int i = 0 ; i <nums.length;i++){
            System.out.println(product / (i+1));

        }
    }
}
