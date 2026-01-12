public class divisiorbut22hahah {
    public static void main(String[] args){

        for(int i = 1000 ; i<10000;i++){
            int count = 0;
            for(int k = 1; k<i+1;k++){
                if(i%k == 0){
                    count++;
                }
            }
            if (count == 22){
                System.out.println(i);
            }
        }

    }
}
