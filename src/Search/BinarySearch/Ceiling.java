package Search.BinarySearch;

public class Ceiling {
    static void main() {
        int arr[] = {12,4,7,9,10,18,20};
        System.out.println(SearcCeiling(arr,11));
    }
    static int SearcCeiling(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low) / 2;

            if(target<arr[mid]){
                high=mid-1;
            } else if (target>arr[mid]) {
                low=mid+1;
            }else{
                return arr[mid];
            }
        }
        return arr[low];
    }
}

// Return the element if present in the array or the first bigger element than the target