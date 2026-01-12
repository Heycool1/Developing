public class didididiididim {
    public static void main(String[] args){
        int[][][] matrix = {
                {
                        { 1,  0, -3},
                        { 4, -1,  2}
                },
                {
                        { 0,  7,  8},
                        {-5,  0,  9}
                },
                {
                        {10, -2,  0},
                        { 3,  6, -4}
                }
        };
        int a = matrix.length;
        int b = matrix[0].length;
        int c = matrix[0][0].length;
        int count = 0 ;


        for(int i = 0; i<a;i++) {
            for(int k = 0 ; k<b ; k++){
                for(int j = 0 ; j<c ; j++){
                    if(matrix[i][k][j] > 0 ){
                        count++;

                    }
                }
            }
        }
        System.out.println(count);
    }
}
