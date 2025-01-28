public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,11,13,45,67};
        int ans = binarySearch(arr,5);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
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
        return -1;
    }
}
