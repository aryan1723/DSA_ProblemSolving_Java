package Search.BinarySearch;

public class BinarySearch {
    static void main() {
        int[] arr = {1,2,6,8,10,26};
        System.out.println(Search(arr,6));
        System.out.println(Search(arr,27));
    }
    static boolean Search(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low) / 2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                high=mid-1;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
        }
        return false;
    }
}

/**
 *
 * Time Complexity : O(LogN)
 * Note : Binary Search can only be applied in sorted array
 * Intuition : Since the array is sorted we check if the element is at the middle part of the array if yes
 *              we found the answer if not then check is the mid greater than the target if yes then exclude
 *              the left part of the array and vice versa.
 *
 **/
