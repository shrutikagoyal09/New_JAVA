public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,6,1,2,9,66};
        int ans = linearSearch(arr,2);
        boolean ans2 = linearSearch2(arr, 69);
        System.out.println(ans);
        System.out.println(ans2);
    }

    //returning index if target found
    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    //returning true or false if element found

    public static boolean linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
