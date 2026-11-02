//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

package Search.BinarySearch;
import java.util.Arrays;

public class FirstAndLastPosition {
    static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,6};
        int[] ans = {-1,-1};
        ans[0] = position(arr,3,true);
        if(ans[0] != -1){
            ans[1] = position(arr,3,false);
        }

        System.out.println(Arrays.toString(ans));
    }
    static int position (int[] arr,int target,boolean first){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low<=high){
            int mid = low + (high-low) / 2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if (arr[mid]>target) {
                high=mid-1;
            }else{
                ans=mid;
                if(first){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }
        return ans;
    }
}
