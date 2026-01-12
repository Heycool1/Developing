import java.util.Scanner;
public class quadtraci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();


        if(b*b-(4*a*c)< 0){
            System.out.println("There is no root");
        }else if((b*b)-(4*a*c) == 0){
            System.out.println("There is one root");
        }else{
            System.out.println("There are 2 roots");
        }
        double delta =(b*b)-4*a*c;

        double num1 = ((-b + Math.sqrt(delta) )/ 2*a);
        double num2 = ((-b - Math.sqrt(delta) )/ 2*a);
        System.out.println(num1);
        System.out.println(num2);


    }
}
