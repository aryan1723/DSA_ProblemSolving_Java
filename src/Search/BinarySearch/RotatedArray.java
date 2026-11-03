package Search.BinarySearch;

public class RotatedArray {
    static void main() {
        int[] arr = {12,19,24,2,4,8,9};
        if(arr[0]<=arr[arr.length-1]){
            System.out.println(arr.length-1);
            return;
        }
        int highest = pivot(arr);
        System.out.println("total rotations: "+(highest+1));
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start) / 2;
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(mid<end && arr[mid+1]<arr[mid]){
                return mid;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end-1]>arr[end]){
                    return end-1;
                }
                end--;
            }
            if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
