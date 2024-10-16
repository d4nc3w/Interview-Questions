// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

#include <vector>
#include <iostream>

class SingleNumber {
public:
    int singleNumber(std::vector<int>& nums){
        sort(nums.begin(), nums.end());
        for(int i = 1; i < nums.size(); i+= 2){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.size()-1];
    }
};

int main(){
    SingleNumber sn;
    std::vector<int> test = {4,1,2,1,2};
    std::cout << sn.singleNumber(test) << std::endl;
};