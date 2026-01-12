public class lastdance {
    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6,7,2,3,5};
        System.out.println(strictlyIncrease(nums));

    }
    public static int strictlyIncrease(int[] nums){
        int a = 1;
        int b = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                a++;
            }else{
                if(b<a){
                    b= a;
                    a = 1 ;
                }
            }
        }
        return b;
    }
}
