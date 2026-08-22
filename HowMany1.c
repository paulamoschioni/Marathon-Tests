#include <stdio.h>
#include<stdlib.h>
int findMaxConsecutiveOnes(int* nums, int numsSize) {
    // create an hipotetical array
    int *hip = malloc (numsSize*sizeof(int));
    for(int j = 0; j < numsSize; j++){
        *(hip+j) = 0;
    }
    int pos = 0;
    for(int i = 0; i < numsSize; i++){
    if(nums[i] == 1){
    *(hip+pos) += 1;
    } else {
    pos++;
    }
}
    int maior = *(hip+0);
    for(int p = 0; p < pos; p++){
        if(maior < *(hip+p)) maior = *(hip+p);
    }
    return maior;
}
    

int main(){
int numsSize;
scanf("%d",&numsSize);
int nums[numsSize];

for(int i = 0; i < numsSize; i++){
    scanf("%d",&nums[i]);
}
printf("%d",findMaxConsecutiveOnes(nums,numsSize));

return 0;
}