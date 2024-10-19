//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
//DO NOT allocate another 2D matrix and do the rotation.

#include <vector>
using namespace std;

class RotateImage {
public:
    void rotate(vector<vector<int>>& matrix) {
        int row = matrix.size();
        //taking transpose of the matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i; j++){
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        //reversing individual rows of matrix
        for(int i = 0; i < row; i++){
            reverse(matrix[i].begin(), matrix[i].end());
        }
    }

    int main(){
        vector<vector<int>> matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
};