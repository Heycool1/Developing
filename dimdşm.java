public class dimdşm {
    public static void main(String[] args){
        int numbers[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = numbers.length;
        for(int i = 0;i<n;i++){
            for(int j = i + 1;j<n;j++){
                int temp = numbers[i][j];
                numbers[i][j] = numbers[j][i];
                numbers[j][i] = temp;
            }
        }
        for(int i = 0 ; i<3 ; i++){
            for(int k = 2 ; k>=0;k--){
                System.out.print(numbers[i][k]+ " ");
            }
            System.out.println();
        }
    }
}
