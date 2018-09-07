public class BinaryIterativeSearch implements Practice2Search {

    public String searchName() {
        return "Binary Iterative Search";
    }

    public int search(int[] arr, int target) {
        int low =0;
        int upper = arr.length -1;
        while (low <= upper) {
            int mid = (low + upper) / 2;
            if (arr[mid] > target) {
                upper = mid -1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}