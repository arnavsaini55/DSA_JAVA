public class floorbS {
    public static void main(String[] args) {
        int arr[] = {99, 88, 77, 66, 50, 40, 33, 24, 12}; 
        int target = 35;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target < arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] < target) {
                end = mid - 1;  
            } else {
                start = mid + 1; 
            }
        }

        return arr[start - 1]; 
    }
}
