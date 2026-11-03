package Search.BinarySearch;

public class SearchInMountainArray {
    static void main() {
        int[] arr = {2,4,13,26,12,3,1};
        int target = 3;
        int pivot = peak(arr);
        if(arr[pivot]==target){
            System.out.println(pivot);
            return;
        }
        int left = BinarySearchLeft(arr,0,pivot,target);
        if(left!=-1){
            System.out.println(left);
            return;
        }else{
            int right = BinarySearchRight(arr,pivot,arr.length-1,target);
            System.out.println(right);
        }
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    static int BinarySearchLeft(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid]<target){
                start = mid+1;
            } else if (arr[mid]>target) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int BinarySearchRight(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(arr[mid]<target){
                end=mid-1;
            } else if (arr[mid]>target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
