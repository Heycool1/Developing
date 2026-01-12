public class hhhh {
    public static void main(String[] args) {

        int n = 7;   // tek sayı daha güzel durur

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Çerçeve her zaman yıldız
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("*");
                }
                // Deltoid (X şekli) → boşluk
                else if (i == j || i + j == n - 1) {
                    System.out.print(" ");
                }
                // Diğer yerler yıldız
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}