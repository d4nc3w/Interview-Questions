package Questions;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int snowball = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                snowball++;
            } else {
                if(snowball > 0){
                    temp = nums[i];
                    nums[i] = nums[i - snowball];
                    nums[i - snowball] = temp;
                }
            }
        }
        return nums;
    }

    //   Time Complexity: O(n)   Space Complexity: O(n)

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] result = moveZeroes(nums);
        for(int n : result){
            System.out.println(n);
        }
    }
}
