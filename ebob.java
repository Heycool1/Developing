import java.util.Scanner;
public class ebob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num a");
        int a = scanner.nextInt();
        System.out.println("Enter num b");
        int b = scanner.nextInt();
        int max = 0;
        if(a<b){
            max = b;

        }else if( a> b){
            max = a;
        }else{
            System.out.println("Ebob is " + a);
        }
        int temp = 1;
        for(int i = 1 ; i<max; i++){
            if(a% i == 0 && b % i == 0){
                temp = i;
            }

        }
        System.out.println(temp);

    }
}
