package Search.LinearSearch;

public class SearchIn2DArray {
    static void main() {
        int arr[][] = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.println(Search(arr,34));
    }
    static boolean Search(int[][] arr, int target){
        int rows = arr.length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
