public class joıfıoafıo {
    public static void main(String[] args){
        int[] numbers = {12,34,123,41,23,-21312,123213};
        System.out.println(sumPositive(numbers));

    }
    public static int sumPositive(int[] numbers){
        int a = 0;
        for(int i = 0 ; i<numbers.length;i++){
            if(numbers[i]> 0 ){
                a += numbers[i];
            }
        }
        return a;

    }
}
