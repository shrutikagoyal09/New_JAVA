import java.util.Arrays;



public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
       for(int i=0; i<arr.length; i++){
           int last = arr.length -1-i;
           int maxIndex = getMaxIndex(arr,0,last);
           swap(arr,last,maxIndex);
       }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max =0;
        for(int i=start; i<last; i++){
            if(arr[i]> arr[max]){
                max =i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }

}
