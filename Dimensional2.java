import java.util.Scanner;
public class Dimensional2 {
    public static void main(String[] args){
        int total = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        int row = scanner.nextInt();
        System.out.println("Enter column");
        int column = scanner.nextInt();
        int numbers[][] = new int[row][column];
        for(int i = 0 ; i<row;i++){
            for(int k = 0 ; k<column;k++){
                numbers[i][k] = (int)(Math.random()*100);
                System.out.print(numbers[i][k] + " ");
                total += (numbers[i][k]);
            }
            System.out.println();
        }
        System.out.println(total);

    }
}