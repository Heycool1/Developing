import java.util.Scanner;
public class Atmm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sifre = 2701;
        int balance = 200000;
        int sum = 0;
        System.out.println("Enter Password");
        int a = scanner.nextInt();
        if (a!=sifre){
            System.out.println("Wrong Password");
            return;
        }

        System.out.println("What Do you wanna do?");
        System.out.println("1-Add fund");
        System.out.println("2-Remove Fund");
        System.out.println("3-Show Balance");
        System.out.println("4-Change Password");
        System.out.println("5-Transfer money");

        int b = scanner.nextInt();
        switch (b){
            case 1 :
                System.out.println("How much Money do you wanna add");
                int d = scanner.nextInt();
                sum += (balance + d);
                System.out.println("New Balance is = " + sum);
                break;
            case 2 :
                System.out.println("How much money do you wanna withdrawl");
                int p = scanner.nextInt();
                sum += (balance - p);
                System.out.println("New Balance is =" + sum);
                break;
            case 3 :
                System.out.println("Your Balance is : " + balance);
                break;
            case 4 :
                System.out.println("Enter your old password");
                int j = scanner.nextInt();
                if (j == sifre){
                    System.out.println("Enter your New Password");
                    int n2 = scanner.nextInt();
                    sifre = n2;;
                    System.out.println(sifre);
                }else{
                    System.out.println("Wrong Password");
                }break;
            case 5 :
                System.out.println("Which account is the sender ?");
                int k = scanner.nextInt();
                System.out.println("Enter Iban");
                int iban = scanner.nextInt();
                System.out.println("Enter Value of the money");
                int i = scanner.nextInt();
                if(i>balance){
                    System.out.println("yetersiz bakiye");

                }else{
                    sum += (balance - i);
                    System.out.println("Done your new balance is = " + sum);
                    break;
                }


            }


    }
}
