public class didididim {
    public static void main(String[] args){
        int nums[][] = {{10,0,0,5},{0,0,0,0},{0,-3,0,0}};
        int count = 0;
        int a = nums.length;
        int b = nums[0].length;
        for(int i = 0 ; i< a;i++){
            for(int k = 0 ; k< b ; k++){
                if(nums[i][k] != 0){
                    count++;
                }
            }
        }

        int spars[][] = new int[count][3];
        int index = 0;
        for(int i = 0 ; i<a ; i++){
            for(int k = 0 ; k<b ;k++){
                if (nums[i][k] != 0 ){
                    spars[index][0]= i;
                    spars[index][1]=k;
                    spars[index][2]= nums[i][k];
                    index++;
                }
            }
        }
        for(int i = 0 ; i<a ; i++){
            System.out.println("{ " +spars[i][0] + " , "+ spars[i][1]+ " , "+ spars[i][2] + " }");
        }
    }
}
