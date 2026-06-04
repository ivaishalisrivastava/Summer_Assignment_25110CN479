
#include<stdio.h>

int main(){
    int num,sum=0,i;
    printf("enter num to Calculate sum of first N natural numbers: ");
    scanf("%d",&num);

    for(i=0;i<num;i++){
        sum=sum+i;
    }

    printf("the sum is-%d", sum);
    return 0;

}