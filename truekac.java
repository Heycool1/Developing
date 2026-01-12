import java.util.Scanner;
public class truekac {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter true value");
        double a = scanner.nextDouble();
        System.out.println(point(a));
        System.out.println(point2(a));

    }
    public static double point(double a){
        double b = 20 - a;
        double c = b * (-0.2);
        double d = a + c;
        System.out.println("When correct is" + a + " method 1 gives " + d);
        return d;
    }
    public static double point2(double a){
        double b = 20 - a;
        double c = b * (-0.2);
        double d = a + c;
        int k = (int) (d);
        return k;

    }
}
