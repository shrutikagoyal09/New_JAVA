import java.util.Arrays;

public class BS_2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        System.out.println(Arrays.toString(binarySearch2D(arr,100)));
    }
    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){

        while(cStart <= cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid] > target){
                cEnd = mid-1;
            }
            else{
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] binarySearch2D(int[][] arr, int target){
        int rows = arr.length;
        if(rows == 1){
            return binarySearch(arr,0,0,arr[0].length,target);
        }

        int cols = arr[0].length;
        int cMid = cols/2;

        int rStart =0;
        int rEnd = rows-1;
        // this loop will run when rows are more than 2
        while(rStart < (rEnd-1)){
            int rMid = rStart + (rEnd-rStart)/2;
            if(arr[rMid][cMid] == target){
                return new int[]{rMid,cMid};
            }
            else if(arr[rMid][cMid] >target){
                rEnd = rMid;
            }
            else{
                rStart = rMid;
            }
        }

        //now 2 rows are remaining
        //first check for target in the mid-column
        if(arr[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(arr[rEnd][cMid] == target){
            return new int[]{rEnd,cMid};
        }

        //if mid-column does not contain the target then divide the remaining array into 4 parts and apply simple binary search on each part
        if(arr[rStart][cMid-1] >= target){
           return binarySearch(arr,rStart,0,cMid-1,target);
        }
        if(arr[rStart][cMid+1] <= target){
           return binarySearch(arr,rStart,cMid+1,cols-1,target);
        }
        if(arr[rEnd][cMid-1] >= target){
           return binarySearch(arr,rEnd,0,cMid-1,target);
        }
        else{
            return binarySearch(arr,rEnd,cMid+1,cols-1,target);
        }

    }
}
