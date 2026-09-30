import java.util.Scanner;
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping 
//intervals that cover all the intervals in the input.
//Paula Moschioni, 30/09/2026.

class Solution {
    public int[][] merge(int[][] intervals) {
        //how many intervals
        int n = intervals.length;
        int[][] output = new int[n][];
        int equals = 0;

        for(int i = 0; i < n; i ++){  ///1 interval, 2 interval
        boolean overlaped = false;
        int size = intervals[i][1] - intervals[i][0] + 1;
        int[] temp = new int[size];
        output[equals][0] = intervals[i][0];
        
        for(int k = 0; k < size; k++){ //create array for intervals I 
            temp[k] = intervals[i][0]++;  
        }
        
            for(int r = i + 1; r < n; r++){
                for(int f = intervals[r][0]; f <= intervals[r][1]; f++){  //for to see the nums of other elements
                    for(int c = 0; c < size; c++){
                            if(temp[c] == f){
                            overlaped = true; 
                            f = ++intervals[r][1];

                            output[equals][0] = intervals[i][0]; 
                            output[equals][1] = intervals[r][1];
                            equals++;
                        } 
                    }
                }
            }
        }
        return output;
    }
}
