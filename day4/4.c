#include <stdio.h>
#include <math.h>

int main() {
    int lower, upper, i, originalNum, remainder, digits;
    int sum;

    printf("Enter lower and upper limit: ");
    scanf("%d %d", &lower, &upper);

    printf("Armstrong numbers between given range: ");
    for (i = lower; i <= upper; i++) {
        if (i < 0) {
            continue; 
        }

        originalNum = i;
        digits = 0;
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }

        originalNum = i;
        sum = 0;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            sum += pow(remainder, digits);
            originalNum /= 10;
        }

        if (sum == i) {
            printf("%d ", i);
        }
    }
    printf("\n");

    return 0;
}