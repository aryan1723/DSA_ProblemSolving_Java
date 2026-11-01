package Search.BinarySearch;

// Order agnostic binary search means binary search but it works is asc as well as desc both the orders

public class OrderAgnosticBinarySearch {
    static void main() {
        int[] ascarr = {2,5,8,10,24};
        int[] descarr = {32,27,20,16,5};

        System.out.println(Search(ascarr,24));
        System.out.println(Search(descarr,32));
    }
    static boolean Search(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        boolean asc = true;
        if(arr[low]>arr[high]){
            asc = false;
        }
        while(low<=high){
            int mid = low + (high-low) / 2;
            if(arr[mid] == target){
                return true;
            }
            if(asc){
                if(arr[mid]<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }else{
                if(arr[mid]<target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return false;
    }
}
