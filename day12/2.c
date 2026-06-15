#include <stdio.h>
#include <math.h>

int isArmstrong(int n) {
    int original = n;
    int temp = n;
    int digits = 0;
    int sum = 0;

    while (temp > 0) {
        digits++;
        temp /= 10;
    }

    while (n > 0) {
        int remainder = n % 10;
        sum += round(pow(remainder, digits));
        n /= 10;
    }

    if (sum == original) {
        return 1;
    } else {
        return 0;
    }
}

int main() {
    int num;

    printf("Enter an integer: ");
    scanf("%d", &num);

    if (num < 0) {
        printf("%d is not an Armstrong number.\n", num);
    } else if (isArmstrong(num)==1) {
        printf("%d is an Armstrong number.\n", num);
    } else {
        printf("%d is not an Armstrong number.\n", num);
    }

    return 0;
}