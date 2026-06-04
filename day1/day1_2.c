#include<stdio.h>

int main(){
    int num,i;
    printf("enter to Print multiplication table of a given number. ");
    scanf("%d",&num);

    for(i=1;i<11;i++){
        printf("%d * %d = %d \n",num,i,num*i);
    }

    return 0;

}