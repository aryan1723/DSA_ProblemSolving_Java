package Search.BinarySearch;

public class FloorElement {
    static void main(String[] args) {
        int arr[] = {1,4,7,9,10,18,20};
        System.out.println(Floor(arr,6));
    }
    static int Floor(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low) / 2;
            if(arr[mid]>target){
                high = mid-1;
            } else if (arr[mid]<target) {
                low = mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[high];
    }
}

// Return the element if present in the array or the first smaller element than the target
