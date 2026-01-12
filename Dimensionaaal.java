import java.util.Scanner;
public class Dimensionaaal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numbers[][] = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
        int totalsatir = 0;
        int max = numbers[0][0];
        int min = numbers[0][0];
        System.out.println("Hnagi satırı istiyon");
        int c = scanner.nextInt();
        for(int i = 0;i<3;i++){
            totalsatir += numbers[c][i];

        }
        for(int i = 0 ; i<4;i++){
            for(int k = 0 ; k<3 ; k++){
                System.out.print(numbers[i][k] + " ");
                if(numbers[i][k]>max){
                    max = numbers[i][k];
                }
                if(numbers[i][k]<min){
                    min = numbers[i][k];
                }

            }
            System.out.println();

        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(totalsatir);
    }
}
