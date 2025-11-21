public class floorbS {
    public static void main(String[] args) {
        int arr[] = {99, 88, 77, 66, 50, 40, 33, 24, 12}; // Descending
        int target = 35;

        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // If floor does not exist
        if (target < arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            // Descending order logic
            if (arr[mid] < target) {
                end = mid - 1;   // move left
            } else {
                start = mid + 1; // move right
            }
        }

        return arr[start - 1];  // floor = last number <= target
    }
}
