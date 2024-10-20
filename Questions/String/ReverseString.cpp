#include <vector>
#include <iostream>
using namespace std;

class ReverseString{
public:
    void reverseString(vector<char>& s) {
        int l = 0;
        int r = s.size() - 1;
        while(l < r){
            swap(s[l++], s[r--]);
        }
    }

    //  Time Complexity O(n)      Space Complexity O(1)
};