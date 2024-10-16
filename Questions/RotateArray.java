package Questions;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for(int i = 0 ; i < n; i++){
            rotated[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[i] = rotated[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] solution = rotate(nums, k);
        for(int num : solution){
            System.out.println(num);
        }
        
    }
}