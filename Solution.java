import java.util.Scanner;
/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are 
(i, 0) and (i, height[i]).Find two lines that together with the x-axis form a container, such that the container contains the most water.
Paula Moschioni, 01/10/2026 
Leetcode
*/
class Solution {
    public int maxArea(int[] height){
        int area, maxArea;
        boolean firstArea = false;
        int n = height.length;
        int esq = 0, dir = n-1;

        while(esq < dir){
            int width = dir - esq;
            int h;
            if(height[dir] > height[esq]){
                h = height[esq];
            } else {
                h = height[dir];
            }
            area = h * width;
            if(firstArea == false) {
                firstArea = true;
                MaxArea = area;
            }
            if(MaxArea < area) MaxArea = area;

            //update pointers
            esq++;
            dir--;
        }

        return maxArea;
    }
}