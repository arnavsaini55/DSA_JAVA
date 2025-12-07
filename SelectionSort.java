public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {9,4,6,5,8,1,3};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print sorted array
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}



// Selection sort always see the first element then sorts and after that elements it seaarches for the smallest
// after finding the smallest it goes to  the  other elements 
// it Sorts one by one 
