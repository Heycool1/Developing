public class negaitcee {
    public static void main(String[] args){
        int[] numbers = {1,2,3,-1,-2,-3,-4,-5};
        System.out.println(countNegative(numbers));

    }
    public static int countNegative(int[] numbers){
        int a = 0;
        for(int i = 0 ; i< numbers.length;i++){
            if(numbers[i]<0){
                a++;
            }
        }
        return a;
    }
}
