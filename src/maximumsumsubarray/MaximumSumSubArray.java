/*

Following is the implementation of Kadane's algorithm.

 */
package maximumsumsubarray;

/**
 *
 * @author Ali
 */
public class MaximumSumSubArray 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] stockPricesYesterday = new int[] {-2,3,2,-1};
        System.out.println(maximumSumOfSubArray(stockPricesYesterday));
    }
    
    private static int maximumSumOfSubArray(int[] arr)
    {
        if (arr.length <= 0)
            return 0;
        
        int globalSum = arr[0];
        int currentSum = arr[0];
        
        for (int i=1; i<arr.length; i++)
        {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            if (globalSum < currentSum)
            {
                globalSum = currentSum;
            }
        }
        
        return globalSum;
    }
    
}
