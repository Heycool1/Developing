import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class kkaka {
    public static void main(String[] args){
        String a = "Hello World";
        System.out.println(a);
        System.out.println("İyidir sen");
        System.out.println("Selamlar");
        char c = a.charAt(1);
        System.out.println("Char at 1 " + c);
        int compareto = a.compareTo("Hello World");
        System.out.println("compare to ; "+ compareto);
        System.out.println(a.concat(" Selamdedik"));
        boolean k = a.contains("World");
        System.out.println(k);
        boolean p = a.endsWith("d");
        System.out.println(p);
        boolean q = a.equals("Hello World");
        System.out.println(q);
        int m = a.length();
        System.out.println(m);
        int j = a.indexOf("H");
        System.out.println(j);
        System.out.println(a.replace('H','x'));
        System.out.println(a.startsWith("Hello"));
        System.out.println(a.substring(5));
        System.out.println(a.toLowerCase(Locale.ROOT));
        System.out.println(a.toUpperCase());


    }



}
