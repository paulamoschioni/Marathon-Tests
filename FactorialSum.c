#include <stdio.h>
/*Read two numbers M and N indefinitely.
 Calculate and write the sum of their factorial. 
 Be carefull, because the result can have more than 15 digits.*/
 int CalculateFact(int num){
    if(num == 0){
        return 1;
    }

    return num * CalculateFact(num - 1);
 }
 
 int main(){
    int m, n;
    int factM, factN;
    scanf("%d %d",&m,&n);

    factM = CalculateFact(m);
    factN = CalculateFact(n);
    printf("%d\n",factM+factM);
    return 0;
 }