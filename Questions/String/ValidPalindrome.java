package Questions.String;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;
        while(start <= last){
            char f = s.charAt(start);
            char l = s.charAt(last);
            if(!Character.isLetterOrDigit(f)){
                start++;
            } else if(!Character.isLetterOrDigit(l)){
                last--;
            } else {
                if(Character.toLowerCase(f) != Character.toLowerCase(l)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
