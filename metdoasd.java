import java.util.Scanner;
public class metdoasd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num");
        int a = scanner.nextInt();
        System.out.println(sumofevens(a));
        System.out.println(numofodds(a));

    }
    public static int sumofevens(int a){
        int sum = 0;
        for(int i=1;i<=a;i++){
            if(i % 2 == 0){
                if(a% i == 0){
                    sum += i;
                }
            }
        }
        return sum;

    }
    public static int numofodds(int a){
        int count = 0;
        for(int i=1;i<a;i++){
            if(i % 2 == 1){
                if(a% i == 0){
                    count++;
                }
            }
        }
        return count;


    }
}
