public class ln2 {
    public static void main(String[] args){
        double ln2 = 0;
        for(double i = 1; i <=1000;i++) {
            if(i%2 == 1){
                ln2 += (1/i);
            }else{
                ln2 -= (1/i);
            }

        }
        System.out.println(ln2);
    }
}
