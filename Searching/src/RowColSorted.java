import java.util.Arrays;

public class RowColSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {19,29,39,49}
        };
        System.out.println(Arrays.toString(rowColSorted(arr,49)));
    }
    public static int[] rowColSorted(int[][] arr, int target){
        int s= 0;
        int e = arr[0].length-1;
        while(s<arr.length && e>0){
            if(arr[s][e] == target){
                return new int[]{s,e};
            }
            else if(arr[s][e] > target){
                e--;
            }
            else{
                s++;
            }
        }
        return new int[]{};
    }
}
