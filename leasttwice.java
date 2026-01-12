import java.util.Scanner;
public class leasttwice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int a = scanner.nextInt();
        System.out.println(leasttwice(a));

    }
    public static int leasttwice(int a){
        int count = 0;
        int multiple = 1;
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[a];
        for(int p = 0;p<a;p++){
            System.out.println("Enter num for array");
            nums[p] = scanner.nextInt();
        }
        for(int i = 0;i<a;i++){
            for(int k = 0;k<a;k++){
                if(nums[k]==nums[i] && k != i){
                    count ++;
                    multiple *= nums[k];

                }
            }
        }
        System.out.println(count);
        return multiple;


    }
}
