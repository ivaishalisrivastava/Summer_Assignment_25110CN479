#include <stdio.h>

int reverseNumber(int n, int reversed) {
    if (n == 0) {
        return reversed;
    }
    return reverseNumber(n / 10, reversed * 10 + (n % 10));
}

int main() {
    int num, result;

    printf("Enter an integer: ");
    scanf("%d", &num);

    int is_negative = 0;
    if (num < 0) {
        is_negative = 1;
        num = -num;
    }

    if (num == 0) {
        result = 0;
    } else {
        result = reverseNumber(num, 0);
    }

    if (is_negative) {
        result = -result;
    }

    printf("Reversed number: %d\n", result);

    return 0;
}