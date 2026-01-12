import java.util.Scanner;
public class GuessBirthdayv2 {
    public static void main(String[] args){
        System.out.println("Set 1 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 1\n" +
                "Set 2 2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31 2\n" +
                "Set 3 4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31 4\n" +
                "Set 4 8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31 8\n" +
                "Set 5 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 16");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is your birthday in set 1");
        int a = scanner.nextInt();
        System.out.println("Is your birthday in set 2");
        int b = scanner.nextInt();
        System.out.println("Is your birthday in set 3");
        int c = scanner.nextInt();
        System.out.println("Is your birthday in set 4");
        int d = scanner.nextInt();
        System.out.println("Is your birthday in set 5");
        int e = scanner.nextInt();

        int count = 0;
        count += a*1;
        count += b*2;
        count += c*4;
        count += d*8;
        count += e*16;
        System.out.println("Your birthday is " + count);

    }
}
