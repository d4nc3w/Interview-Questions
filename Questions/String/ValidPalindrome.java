package Questions.String;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;
        while(start <= last){
            char currentS = s.charAt(start);
            char currentL = s.charAt(last);
            
            if(!Character.isLetterOrDigit(currentS)){
                start++;
            } else if(!Character.isLetterOrDigit(currentL)){
                last--;
            } else {
                if(Character.toLowerCase(currentS) != Character.toLowerCase(currentL)){
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
