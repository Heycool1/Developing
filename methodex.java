import java.util.Scanner;
public class methodex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = scanner.nextInt();
        System.out.println(getRadius(r));
        System.out.println(calculateArea(r));
        System.out.println(displayResults(r));

    }
    public static int getRadius(int r){
        if(r<= 0){
            System.out.println("Invalid");
        }
        return r;
    }
    public static double calculateArea(int r){
        return (3.14 * r * r);
    }
    public static double displayResults(int r ){
        return (3.14*2*r);
    }
}
