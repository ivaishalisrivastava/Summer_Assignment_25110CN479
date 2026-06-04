#include<stdio.h>

int main(){
    int num,fact=1,i;
    printf("enter num to Find factorial of a number. : ");
    scanf("%d",&num);

    for(i=1;i<num+1;i++){
        fact=fact*i;
    }

    printf("the factorial; is-%d",&fact);
    return 0;

}