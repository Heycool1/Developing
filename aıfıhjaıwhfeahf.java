public class aıfıhjaıwhfeahf {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sumAtEvenIndex(arr));



    }
    public static int sumAtEvenIndex(int[] arr){
        int a = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]% 2 == 0){
                a+= arr[i];

            }
        }
        return a;

    }
}
