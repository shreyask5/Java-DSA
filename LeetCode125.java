import java.util.Locale;

public class LeetCode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s){
        String new_s = s.replaceAll("[\\s\\p{Punct}]","").toLowerCase();
        int first = 0;
        int last = new_s.length() - 1;
        while (last > first){
            if(new_s.charAt(first) == new_s.charAt(last)){
                first += 1;
                last -= 1;
            }else
                return false;
        }
        return true;
    }
}
