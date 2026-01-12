import java.util.Scanner;
public class Midtermcalisma4 {
    public static void main(String[] args){
        int maxrowsum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[3][3];
        for(int i = 0 ; i <3;i++){
            int rowsum = 0;
            for(int k =0 ; k<3 ; k++){
                System.out.println("Enter number");
                numbers[i][k] = scanner.nextInt();
                rowsum += numbers[i][k];
            }
            if(maxrowsum<rowsum){
                maxrowsum= rowsum;
            }
            System.out.println("Max row sum" + rowsum);
            System.out.println("Row " + i +" sum " + rowsum);
        }




    }
}
