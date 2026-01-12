import java.util.Scanner;
public class hayrankaldim {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght of array");
        int a = scanner.nextInt();
        System.out.println("Enter target");
        int b = scanner.nextInt();

        System.out.println(method(a,b));





    }
    public static String method(int a,int b){
        String p = "";
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[a];
        for(int i = 0;i<a;i++){
            System.out.println("Enter a num for array");
            nums[i] = scanner.nextInt();
        }
        for(int i = 0;i<a;i++){
            for(int k = 0; k<a;k++){
                if (nums[i]+nums[k] == b){
                    p = (nums[i] + " and " + nums[k]);
                }

            }
        }
        return p;

    }
}
