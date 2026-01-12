import java.util.Scanner;
public class kafjajfowfjawfjpwajnfawj {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int a = scanner.nextInt();
        System.out.println("Enter the lenght of array");
        int b = scanner.nextInt();
        System.out.println(howmany(a,b));


    }
    public static int howmany(int a,int b){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int[][] ckj = new int[a][b];
        for(int i = 0 ; i<a ; i++){
            for(int k = 0 ; k<b;k++){
                System.out.println("ENTER VALUE");
                ckj[i][k] = scanner.nextInt();
            }
        }
        for(int i = 0; i<a;i++){
            for(int k = 0; k<b ; k++){
                if(ckj[i][k] < 0){
                    count++;

                }
            }
        }
        return count;

    }
}
