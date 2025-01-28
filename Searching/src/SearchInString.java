public class SearchInString {
    public static void main(String[] args) {
        String a = "Shrutika";

        boolean ans = search(a,'u');
        boolean ans2 = search(a,'t');
        System.out.println(ans);
        System.out.println(ans2);
    }
    public static boolean search(String s, char target){
        if(s.length() == 0){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(target == s.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static boolean search2(String s, char target){
        if(s.length() == 0){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
