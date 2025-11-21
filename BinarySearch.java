public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {2,3,4,5,6,88,99,100};
        int target = 7;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return arr[mid];
            }

            if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start]; 
    }
}
