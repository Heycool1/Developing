import java.util.Scanner;
public class Day {
    public static void main(String[] args){
        System.out.println("Selamoçnabernasılsınöncekopyalamayabaşlasonrakendilğindnendönüşecekdemişerumarımhaklılardır snce bu yazıcıdan bi şeyler çıkarmak mantıklı mı değer değişse neden değil olammasıon nedenimnin ne olduugunub anna açıklayabilirm iisn açıklamanı da geçtim had isikti et bana sdece günlük tutmak mamntıklı mıo onu soyle sdesem ne dersin ben olsam evet eridm sadece senden gelce k bir onay beklemekteyim evet de ve günlük ala tım ya da almasam mı bilgisayar ayazamak daha mı ımantıklı ama o zaman fiizksel bi sey olimcak ama noyle yazmak daha hosuma gidiyor su an her neyse");
        System.out.println("Enter e value of the day[0,6]");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("Enter the number you want to add");
        int d2 = scanner.nextInt();
        int d3 = ((d2 + day)% 7);
        System.out.println(d3   );
       if (d3 == 0){
           System.out.println("Monday");
       }else if (d3 ==1){
           System.out.println("Tuesday");
       }else if (d3 ==2){
           System.out.println("Wednesday");
       }else if (d3==3){
           System.out.println("Thursday");
       }else if(d3 ==4){
           System.out.println("Friday");
       }else if (d3==5){
           System.out.println("Saturday");
       }else if (d3==6){
           System.out.println("Sunday");
       }
    }

}
