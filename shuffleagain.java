import java.util.Arrays;

public class shuffleagain {
    public static void main(String[] args){
        int[] numbers = {12,23,43,1,2,4,5,43,23,15};
        for(int i = 0;i<10;i++){
            int j = (int)(Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
