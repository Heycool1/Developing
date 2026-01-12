import java.util.Scanner;
public class discon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total amont of order");
        int a = scanner.nextInt();
        System.out.println("Are you premium member 1/0?");
        int b = scanner.nextInt();
        if(b == 0 && a<=100){
            System.out.println("No Discount Applied.");
            System.out.println("Order amount : " + a);
        }else if(b == 1 && a<= 100){
            System.out.println("Loyalty Discount : % 5");
            System.out.println("Order amount : " + ((a * 95)/100));
        }else if(b == 0 && a>100){
            System.out.println("High-Value Order : % 10");
            System.out.println("Order amount : "+ ((a*90)/100));
        }else{
            System.out.println("High-Value Order + Premium Discount:%20");
            System.out.println("Order amount : "+ ((a*8)/10));
        }
    }
}
