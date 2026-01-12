import java.util.Arrays;

public class Shifting {
    public static void main(String[] args){
        int[] numbers = {12,23,34,45,56,67,78,89};
        int temp = numbers[0];
        for(int i = 1 ; i<numbers.length;i++){
            numbers[i-1] = numbers[i];
        }
        numbers[numbers.length-1]= temp;
        System.out.println(Arrays.toString(numbers));
    }
}
