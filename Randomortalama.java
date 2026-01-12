import java.util.Arrays;

public class Randomortalama {
    public static void main(String[] args){
        int total = 0;
        int yuksek = 0;
        int[] numbers = new int[50];
        for(int i = 0;i<50;i++){
            numbers[i] = (int)(Math.random()*100);
        }
        for(int i =0;i<50;i++){
            total += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(total);
        int average = total/50;
        System.out.println("average : " + average);
        for(int i = 0;i<50;i++){
            if (numbers[i]>44){
                yuksek++;

            }
        }
        for(int k = 0; k<50;k++){
            for(int p = k+1;p<50;p++){
                if (numbers[k] == numbers[p]){
                    System.out.println("tekrar eden = " + numbers[k]);
                }
            }
        }
        System.out.println(yuksek);
    }
}
