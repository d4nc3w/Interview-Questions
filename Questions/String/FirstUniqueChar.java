package Questions.String;

public class FirstUniqueChar{
    public static int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i);
            if(i == s.lastIndexOf(c) && i == s.indexOf(c)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String word = "leetcode";
        int index = firstUniqChar(word);
        System.out.println(index);
    }
}