import java.util.Arrays;

public class arrayrow {
    public static void main(String[] args) {
        int arr [][] = {
            {10,20,30,40},
            {15,25,35,45},
            {18,28,38,48},
        };

        System.out.println(Arrays.toString(search(arr, 40)));
    }

    static int[] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix[0].length - 1; // FIX 1: last column

        while (r < matrix.length && c >= 0) {

            if(matrix[r][c] == target){
                return new int[]{r, c};
            }

            if(matrix[r][c] < target){
                r++;                   // move down
            } else {
                c--;                   // FIX 2: move left
            }
        }

        return new int[]{-1, -1};     // FIX 3: return if not found
    }
}
