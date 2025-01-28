public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        int[] nums = {16,14,12,10,8,6,4};
        int ans1 = orderAgnosticBS(arr,10);
        int ans2 = orderAgnosticBS(nums,10);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    public static int orderAgnosticBS(int[] arr, int target){
        int s =0;
        int e = arr.length-1;
        if(arr[s] < arr[e]){
            while(s<=e){
                int mid = s + (e-s)/2;
                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid] > target){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        else{
            while(s<=e){
                int mid = s + (e-s)/2;
                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid] > target){
                    s=mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }
}
