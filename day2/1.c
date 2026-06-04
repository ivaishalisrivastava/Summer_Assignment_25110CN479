#include <stdio.h>

int main() {
    int num, remainder, sum = 0;

   
    printf("Enter an integer: ");
    scanf("%d", &num);

   
    int original_num = num;

  
    if (num < 0) {
        num = -num;
    }

   
    while (num > 0) {
        remainder = num % 10;  
        sum = sum + remainder; 
        num = num / 10;        
    }


    printf("The sum of the digits of %d is: %d\n", original_num, sum);

    return 0;
