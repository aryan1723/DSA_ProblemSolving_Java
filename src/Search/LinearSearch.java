package Search;

public class LinearSearch {
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Search(arr,5));
        System.out.println(Search(arr,9));
    }
    static boolean Search(int[] arr,int element){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }
}

/**
 *
 * Time Complexity O(N)
 * Intiution : take each element from array then compare it and check if it is equals to the
 *             target element if yes we found the element if not its not present.
 *
 **/
