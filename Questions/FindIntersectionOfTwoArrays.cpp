// Given two integer arrays nums1 and nums2, return an array of their intersection. 
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

#include <iostream>
#include <vector>
using namespace std;

class FindIntersectionOfTwoArrays {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        // get the size of each vector and sort both of them
        int n1 = nums1.size();
        int n2 = nums2.size();
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());

        vector<int> output;

        // take two points on start of each vector for compare the values
        int start1 = 0, start2 = 0;
        while(start1<n1 && start2<n2){
            // values on both pointers are equal
            if(nums1[start1] == nums2[start2]){
                output.push_back(nums1[start1]);
                start1++;
                start2++;
            }

            // if values on any pointer is less than other then increase the pointer to match the greater value
            else if(nums1[start1]<nums2[start2]){
                start1++;
            }
            else {
                start2++;
            }
        }
        return output;
    }
};

// Time Complexity: O(n*log(n))     Space Complexity: O(n)