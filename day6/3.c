#include <stdio.h>

int main() {
    int num, ori_num, count = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    ori_num = num;

    while (num != 0) {
        num = num & (num - 1);
        count++;
    }

    printf("Number of set bits in %d is: %d\n", ori_num, count);

    return 0;
}