import java.util.Scanner;
public class monnnney {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial money");
        double a = scanner.nextDouble();
        System.out.println("Enter year");
        int b = scanner.nextInt();
        System.out.println(option1(a,b));
        System.out.println(option2(a,b));
        if(option1(a,b)> option2(a,b)){
            System.out.println("Suggested one is option1");
        }else if ( option1(a,b)< option2(a,b)){
            System.out.println("Suggested one is option2");
        }else{
            System.out.println("You can choose any of them");
        }

    }
    public static double option1(double a , int b){
        double max = a;
        for(int i = 0;i<b;i++){
            max += (a * 7)/ 100 ;
        }
        return max;


    }
    public static double option2(double a, int b){
        double max2 = a;
        for(int k = 1; k<=b;k++){
            if(k%3 == 0){
                max2 += (a*21)/100;
            }


        }
        return max2;
    }
}
