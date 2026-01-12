public class CompositeNumbers {
    public static void main(String[] args){
        for(int i =1 ; i<=100 ;i++){
            if(!isPrime(i)&& i %3 == 0){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n% i==0){
                return false;
            }
        } return true;

    }
}
