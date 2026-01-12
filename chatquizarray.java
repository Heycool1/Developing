import java.util.Arrays;

public class chatquizarray {
    public static void main(String[] args){
        int[] numbers = new int[10];
        int count = 0;
        for(int i = 0 ; i< numbers.length;i++){
            numbers[i] = (int)(Math.random()*100);
        }
        Arrays.sort(numbers);
        System.out.println("min value : " +numbers[0]);
        System.out.println("max value : " + numbers[numbers.length-1]);
        System.out.println(Arrays.toString(numbers));
        for(int i = numbers.length -1;i>0;i--){
            System.out.println(numbers[i]);
        }
        for(int i = 0 ; i< numbers.length;i++){
            if (numbers[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Çift sayısı : " + count);
    }
}
