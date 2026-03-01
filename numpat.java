public class numpat {
    int numberpattern;

    numpat(){

    }
    void printPattern(int numberpattern){
        this.numberpattern = numberpattern;
        for(int i = 1 ; i <= numberpattern ; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k  + " ");
            }
            System.out.println(" ");
        }

    }
    void sum_of_nums(int numberpattern){
        int c = 0;
        this.numberpattern = numberpattern;
        for(int i = 1 ; i<= numberpattern;i++){
            c += i;
        }
        System.out.println(c);
    }
}
