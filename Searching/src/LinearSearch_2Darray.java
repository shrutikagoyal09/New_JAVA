import java.util.Arrays;

public class LinearSearch_2Darray {
    public static void main(String[] args) {
   int[][] arr = {
           {4,1,78},
           {8,43,6},
           {99,82,65}
   };
        System.out.println(Arrays.toString(linearSearch2Darray(arr,100)));
    }
    public static int[] linearSearch2Darray(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
