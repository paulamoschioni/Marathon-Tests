#include <stdio.h>
#include<stdlib.h>
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) { //returnSize=array 2n
    int N = 2*numsSize;
    int intern = 0;
    for(int i = 0;i < N; i++){
        *(returnSize + i) = nums[intern];
        intern++;
        if(intern == (numsSize)) intern = 0;
    }
    return returnSize;
}

int main(){
    int n;
    scanf("%d",&n);
    int nums[n];
    
    //Read array
    for(int i = 0; i < n; i++){
        scanf("%d",&nums[i]);
    }
  int new = 2*n;
  int *returnSize = malloc (new *sizeof(int));
 getConcatenation(nums,n,returnSize);
for(int j = 0; j < new; j++){
    printf("%d",returnSize[j]);
}
free(returnSize);
return 0;
}