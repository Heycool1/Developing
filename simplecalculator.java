import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = scanner.nextInt();
        System.out.println("Enter num 2");
        int num2= scanner.nextInt();
        System.out.println("Enter operation");
        int a = scanner.nextInt();
        switch(a){
            case 1:
                System.out.println("+ = " + (num1+num2));
                break;
            case 2:
                System.out.println("- = " + (num1-num2));
                break;
            case 3:
                System.out.println("* = "   + (num1*num2));
                break;
            case 4:
                System.out.println("/ = " + (num1/num2));
                break;
            case 5:
                System.out.println("**" + Math.pow(num1,num2));
                break;
        }

    }

}
