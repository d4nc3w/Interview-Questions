package Questions;
import java.util.HashSet;

public class ContainsDuplicate {
    //                      BRUTE FORCE
    // public static boolean containsDuplicate(int[] nums) {
    //     int length = nums.length;
    //     for(int i = 0; i < length; i++){
    //         for(int j = i+1; j < length; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 5};
        System.out.println(containsDuplicate(nums));
    }
}
