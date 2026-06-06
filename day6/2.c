#include <stdio.h>

int main() {
    long long binary_num, ori_num;
    int decimal_num = 0, base = 1, remainder;

    printf("Enter a binary number: ");
    scanf("%lld", &binary_num);

    ori_num = binary_num;

    while (binary_num > 0) {
        remainder = binary_num % 10;
        decimal_num = decimal_num + remainder * base;
        binary_num = binary_num / 10;
        base = base * 2;
    }

    printf("Decimal equivalent of %lld is: %d\n", ori_num, decimal_num);

    return 0;
}