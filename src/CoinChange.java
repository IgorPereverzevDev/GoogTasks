public class CoinChange {
    static long countWays(int S[]) {

        int n = S.length;
        int table[]=new int[n+1];

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[] values
        // after the index greater than or equal to the value of the
        // picked coin
        for(int i=0; i<n; i++)
            for(int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];

        return table[n];
    }

    // Driver Function to test above function
    public static void main(String args[])
    {
        //int arr[] = {41, 34, 46, 9, 37, 32, 42, 21, 7, 13, 1, 24, 3, 43, 2, 23, 8, 45, 19, 30, 29, 18, 35, 11};
        //int arr[] ={1,2,3};
        int arr[] = {1, 2, 1, 1};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr));
    }
}
