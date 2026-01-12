import java.util.Scanner;
public class Midtermcalisma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        double a = scanner.nextDouble();
        System.out.println("Enter number 2");
        double b = scanner.nextDouble();
        double average = (a+b)/2;
        System.out.println(average);
        if(a> 18 && b> 18 ){
            System.out.println("They are bigger than 18");
        }else if (a<18 && b>18){
            System.out.println("A is not bigger");
        }else if (a>18 && b < 18){
            System.out.println("B is not bigger than 18");

        }else{
            System.out.println("They are not bigger than 18");
        }
    }
}
