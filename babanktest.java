import java.util.Scanner;
public class babanktest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        babank p1 = new babank();
        p1.AccountID = 1;
        p1.balance = 1000;
        p1.currency = "TL";
        p1.deposit(50);
    }
}
