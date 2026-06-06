#include <stdio.h>

int main() {
    int base, result = 1;
    int exponent, ori_exponent;

    printf("Enter base (x): ");
    scanf("%d", &base);
    printf("Enter exponent (n): ");
    scanf("%d", &exponent);

    ori_exponent = exponent;

    int n = exponent;
    if (n < 0) {
        n = -n;
    }

    for (int i = 1; i <= n; i++) {
        result *= base;
    }

    if (ori_exponent < 0) {
        result = 1 / result;
    }

    printf("%d^%d = %d\n", base, ori_exponent, result);

    return 0;
}