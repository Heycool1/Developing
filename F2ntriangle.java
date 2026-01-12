import java.util.Scanner;
public class F2ntriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scanner.nextInt();
        System.out.println("Enter b ");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        int result = TriangleType(a,b,c);
        int result2 = TypeTriangle(a,b,c);
        if (result == 1){
            if (result2 == 1){
                System.out.println("Equilateral");
            }else if ( result2 == 2){
                System.out.println("Isosceles triangle");
            }else{
                System.out.println("Scalene triangle");
            }

        }else {
            System.out.println("İllegal triangle");
        }

    }
    public static int TriangleType(int a, int b, int c){
        if (((a - b)>c) || ((a+b)<c) || ((a+c)<b) || ((a-c)>b) || ((b+c)<a)||((b-c)>a)){
            return 1 ;
        }else {
            return 0 ;
        }
    }
    public static int TypeTriangle(int a,int b , int c){
        if(a==b&&a==c){
            return 1;
        }else if((a==b && a != c)||(b==c && b !=a)||(c==a && c != b )){
            return 2;
        }else{
            return 3;
        }
    }
}
