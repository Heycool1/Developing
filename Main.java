import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("For food (1) For transportation (2)");
        int a = scanner.nextInt();
        int fpricetotal = 0;
        int tpricetotal = 0;
        if (a==1){
            while(true){
                System.out.println("Enter Value (-1 for exit)");
                int fprice = scanner.nextInt();
                fpricetotal += fprice;
                if(fprice == -1){
                    System.out.println("Total Amount of food :" + fpricetotal);
                    break;
                }


            }
        }else if (a==2){
            while(true){
                System.out.println("Enter Value (-1) for exit");
                int tprice = scanner.nextInt();
                tpricetotal += tprice;
                if(tprice== -1){
                    System.out.println("Total amount of Transportation" + tpricetotal);
                    break;
                }
            }
        }
    }
}