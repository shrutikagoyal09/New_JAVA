public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int k=2;
        int ans = maximumSumSubarray(arr,k);
        System.out.println(ans);
    }
    public static int maximumSumSubarray(int[] arr, int k) {
        int l =0;
        int r = k-1;
        int maxSum =0;
        int currentsum = 0;
        for(int i=l; i<=r; i++){
            currentsum += arr[i];
        }
        maxSum = currentsum;
        for(int i=0; i<arr.length-k; i++){
            r++;
            currentsum = currentsum - arr[l] + arr[r];
            if(currentsum > maxSum){
                maxSum = currentsum;
            }
            l++;
        }
        return maxSum;
    }
}
