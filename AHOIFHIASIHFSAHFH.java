public class AHOIFHIASIHFSAHFH {
    public static void main(String[] args){
        int[] arr = {12,2,3,4,5,1,124};
        System.out.println(maxDiff(arr));

    }
    public static int maxDiff(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int diff = max - min;
        return diff;

    }
}
