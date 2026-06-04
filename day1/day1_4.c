#include<stdio.h>

int main(){
    int num,count=0,i;
    printf("enter num to Count digits in a number.  : ");
    scanf("%d",&num);

    while(num!=0){
        num=num/10;
        count++;
    }

    printf("the count is-%d",&count);
    return 0;

}