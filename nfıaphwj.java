import java.util.Scanner;
public class nfıaphwj {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int a = scanner.nextInt();
        System.out.println("Enter the length");
        int b = scanner.nextInt();
        System.out.println(maxx(a,b));

    }
    public static int maxx(int a,int b){
        int[] max = new int[a];
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[a][b];
        for(int i = 0; i<a;i++){
            for(int k = 0 ; k<a;k++){
                System.out.println("Enter value");
                nums[i][k] = scanner.nextInt();
            }
        }
        for(int i = 0; i<a;i++){

            int maxis = 0;
            for(int k = 0 ; k<a;k++){
                if(maxis < nums[i][k]){
                    maxis = nums[i][k];
                }


            }
            max[i] = maxis;
        }
        for(int g = 0; g<a;g++){
            System.out.println(max[g]);

        }

        return -1;


    }
}
