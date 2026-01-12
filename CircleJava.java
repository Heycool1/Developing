import java.util.Scanner;
public class CircleJava {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        while(true){
            System.out.println("Enter a year : ");
            year = scanner.nextInt();
            if (year == 0){
                break;
            }
            if (isLeapYear(year)){
                System.out.println("it is a leap year");
            }else{
                System.out.println("İt is not a leap year");
            }
        }
        System.out.println("Program finished");
    }

    public static boolean isLeapYear(int year){
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
