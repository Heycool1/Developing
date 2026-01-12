public class StringManipulationAndLooping {
    public static void main(String[] args){
        String a = "Programming in Java";
        int count = 0;
        for(int i = 0 ; i<a.length();i++){
            if(a.charAt(i) == 'a'){
                count++;
            }

        }
        System.out.println(count);
        String b = "";
        for(int i =a.length()-1;i>=0;i--){
            b+= a.charAt(i);
        }
        System.out.println(b);
    }
}
