public class BinaryRecursiveSearch implements Practice2Search{

    public String searchName() {
        return "Binary Recursive Search";
    }

    public int search(int[] arr, int target) {
        return BinarySearch(arr, target, 0, arr.length);
    }

    public int BinarySearch(int [] arr, int target, int low, int upper){
        int mid = (low + upper)/2;
        if(low > upper){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        } else if(target<arr[mid]){
            return BinarySearch(arr, target, low, mid-1);
        } else{
            return BinarySearch(arr, target, mid+1, upper);
        }
    }
}
