//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

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
    //              [Time complexity O(n^2)]


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

    //              [Time complexity O(n)]

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 5};
        System.out.println(containsDuplicate(nums));
    }
}
