import java.util.*;

public class FirstNegativeInEveryWindow {
    public static void main(String[] args) {
//         List<Integer> list = new ArrayList<>();
    }
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        Queue<Integer> queue = new LinkedList<>();
         int l=0;
         int r=k-1;
         List<Integer> list = new ArrayList<>();
         for(int i=l; i<=r; i++){
             if(arr[i] < 0){
                 queue.offer(arr[i]);
             }
         }
         if(queue.isEmpty()){
             list.add(0);
         }
         else{
             list.add(queue.peek());
         }

         for(int i=0; i<arr.length-k; i++){
             if(arr[l] < 0){
                 queue.poll();
                 list.add(queue.peek());
             }
             l++;
             r++;
             if(arr[r] <0){
                 queue.offer(arr[r]);
             }
//             list.add(queue.peek());
             if(queue.isEmpty()){
                 list.add(0);
             }
             else{
                 list.add(queue.peek());
             }

         }
        return list;
    }
}
