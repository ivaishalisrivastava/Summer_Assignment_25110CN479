#include <stdio.h>

int main() {
    int num, ori_num, remainder, sum = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    ori_num = num;

    while (num > 0) {
        remainder = num % 10;
        
        int fact = 1;
        for (int i = 1; i <= remainder; i++) {
            fact *= i;
        }
        
        sum += fact;
        num /= 10;
    }

    if (sum == ori_num && ori_num > 0) {
        printf("%d is a strong number.\n", ori_num);
    } else {
        printf("%d is not a strong number.\n", ori_num);
    }

    return 0;
}