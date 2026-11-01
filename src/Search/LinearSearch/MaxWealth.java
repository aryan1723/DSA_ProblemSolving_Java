package Search.LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    static void main() {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(Wealth(accounts));
    }
    static int Wealth(int[][] arr){
        int sum = 0;
        for(int[] row : arr){
            int currentsum = 0;
            for(int money : row){
                currentsum += money;
            }
            if(currentsum>sum){
                sum = currentsum;
            }
        }
        return sum;
    }
}

/**
 * Time Complexity : O(N^2)
 * Intiution : Sum of all elements in each row is the total ammount of money each person have in their bank account
 *             then we have to find which row has the maximum sum;
 **/