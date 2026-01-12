import java.util.Scanner;
import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args){
        int[] numbers={34,76,65,54};
        for(int i = 0;i< numbers.length-1;i++){
            int j = (int)(Math.random()*numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        System.out.println(Arrays.toString(numbers));

    }

}
