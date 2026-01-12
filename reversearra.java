public class reversearra {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int k = nums.length;
        for(int i = 0;i<k/2;i++){
            int temp = nums[i];
            nums[i] = nums[k-1-i];
            nums[k-1-i] = temp;


            }
        for(int q = 0;q< k ;q++){
            if (q==0){
                System.out.print("[");
            }
            System.out.print(nums[q] + " , ");
            if (q == k-1){
                System.out.println("]");
            }
        }

        }




}
