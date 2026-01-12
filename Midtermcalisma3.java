import java.util.Scanner;
public class Midtermcalisma3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        int max = 0;
        for(int i = 0 ; i<5;i++){
            System.out.println("Enter " + i);
            numbers[i] = scanner.nextInt();
            total += numbers[i];
            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        int average = total / 5;
        System.out.println("Average is " + average);
        System.out.println("New max is " + max);
    }
}
