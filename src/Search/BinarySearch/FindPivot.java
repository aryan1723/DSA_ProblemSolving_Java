package Search.BinarySearch;

public class FindPivot {
    static void main(String[] args) {
        int[] arr = {12,19,24,2,4,8,9};
        System.out.println(pivot(arr));
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start) / 2;
            if(start<mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(end>mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
