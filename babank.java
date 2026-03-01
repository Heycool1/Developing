public class babank {
    int AccountID;
    double balance;
    String currency;
    void deposit(int a){
        balance = balance - a;
        System.out.println(balance);
    }
}
