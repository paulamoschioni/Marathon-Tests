import java.util.Scanner;
//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping 
//intervals that cover all the intervals in the input.
//Paula Moschioni, 30/09/2026.
/* 
class Solution {
   
    public int[][] merge(int[][] intervals) {
        //how many intervals
        int n = intervals.length; 
        int[][] output = new int[n][2];
        int equals = 0;

        for(int i = 0; i < n - 1; i ++){  ///1 interval, 2 interval
        boolean overlaped = false;
        int size = intervals[i][1] - intervals[i][0] + 1;
        int[] temp = new int[size];
        output[equals][0] = intervals[i][0];
        
        for(int k = 0; k < size; k++){ //create array for intervals I 
            temp[k] = intervals[i][0]; 
            intervals[i][0]++; 
        }
        
            for(int r = i + 1; r < n; r++){

                for(int f = intervals[r][0]; f <= intervals[r][1]; f++){  //for to see the nums of other elements
                    for(int c = 0; c < size; c++){
                            if(temp[c] == f){
                            overlaped = true; 
                            f = intervals[r][1];
                            intervals[r][1]++;

                            //check if interval[i] is smaller than interval[r]
                            if(intervals[i][0] < intervals[r][0]) {
                                intervals[i][1] = intervals[r][1]; 
                            } else if(intervals[i][0] > intervals[r][0]){ //i is bigger than r
                                intervals[i][0] = intervals[r][0]; 
                            }
                        } 
                    }
                }
                output[equals][0] = intervals[i][0];
                output[equals][1] = intervals[i][1];
                equals++;
            }
        }
        return output;
    }
}
*/

class Solution{
        public void insertionSort(int intervals[][], int n){
            //choose insertion because of the stability of the algorithm
            for(int i = 1; i < n; i++){
                int[] chave = intervals[i];
                int j = i - 1;
                while(j >= 0 && chave[0] < intervals[j][0]){
                    intervals[j + 1] = intervals[j];
                    j--;
                }
            intervals[j+1] = chave;
            }
        }

        public int[][] merge(int[][] intervals) {
        //how many intervals
        int n = intervals.length; 
        int[][] output = new int[n][2];
        int o = 0;

        //ordenate the arrays
        insertionSort(intervals, n);
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                if(intervals[j][0] < intervals[i][1]) {
                    if(intervals[j][1] > intervals[i][1]){    
                        intervals[i][1] = intervals[j][1];
                    }
            }
        
            output[o][0] = intervals[i][0];
            output[o][1] = intervals[i][1];
            o++;
            }
        }

            int[][] resposta = new int[o][2];
        for(int k = 0; k < o; k++){
            resposta[k][0] = output[k][0];
            resposta[k][1] = output[k][1];
        }
        return resposta;
    }
}