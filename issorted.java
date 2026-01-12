public class issorted {

    public static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;   // 🔑 KİLİT SATIR
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 7, 6};
        System.out.println(isSorted(numbers));
    }
}