import java.util.Scanner;
public class Circlee {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = scanner.nextDouble();
        double area = getarea(radius);
        double circumreference = getcircumreference(radius);
        System.out.println("Area is : " + area);
        System.out.println("Circumreference is : " + circumreference);

    }
    public static double getarea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
    public static double getcircumreference(double radius){
        return 2* Math.PI *  radius;
    }
}
