public class ragged2d {
    public static void main(String[] args){
        int[][] nums = {{1,2,3},{11,12,15},{123123,1,2}};
        System.out.println(mostBalancedRowIndex(nums));
    }

    public static int mostBalancedRowIndex(int[][] nums) {
        if (nums == null || nums.length == 0) return -1;

        int bestIndex = -1;
        int bestDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null || nums[i].length == 0) continue;

            int min = nums[i][0];
            int max = nums[i][0];

            for (int k = 1; k < nums[i].length; k++) {
                if (nums[i][k] < min) min = nums[i][k];
                if (nums[i][k] > max) max = nums[i][k];
            }

            int diff = max - min;

            if (diff < bestDiff) {
                bestDiff = diff;
                bestIndex = i;
            }
        }
        return bestIndex;
    }
}