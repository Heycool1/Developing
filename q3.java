import java.util.Scanner;
public class q3 {
    public static boolean isLeapYear(int year){
        return(year % 4 == 0) &&(year %100 != 0) && (year % 400== 0);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a year");
            int year = scanner.nextInt();
            if (year == 0 ){
                break;
            }
        }
    }
}
