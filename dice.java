import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Scanner;
import java.util.Random;
public class dice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(1,6);
        System.out.println("Enter a random");
        int b = scanner.nextInt();
        if(a ==b ){
            System.out.println("You Win");

        }else{
            System.out.println("Number was " + a);
        }
        double c = Math.pow(2,3);
        System.out.println(c);
    }

}
