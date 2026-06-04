#include <stdio.h>
#include <math.h>

int main() {
    int lower, upper, i, j, isPrime;

    printf("Enter lower and upper limit: ");
    scanf("%d %d", &lower, &upper);

    if (lower < 2) {
        lower = 2;
    }

    printf("Prime numbers between given range: ");
    for (i = lower; i <= upper; i++) {
        isPrime = 1;
        int limit = (int)sqrt(i);

        for (j = 2; j <= limit; j++) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime) {
            printf("%d ", i);
        }
    }
    printf("\n");

    return 0;
}