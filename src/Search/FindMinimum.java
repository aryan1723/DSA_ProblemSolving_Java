package Search;

public class FindMinimum {
    static void main() {
        int arr[] = {11,4,2,6,10,3};
        int min = arr[0];
        for(int el : arr){
            if(el<min){
                min = el;
            }
        }
        System.out.println(min);
    }
}
