#include <stdio.h>

int main() {
    int decimal_num, remainder;
    int binary_array[32];
    int i = 0;

    printf("Enter a decimal number: ");
    scanf("%d", &decimal_num);

    if (decimal_num == 0) {
        printf("Binary equivalent: 0\n");
        return 0;
    }

    int temp = decimal_num;
    if (temp < 0) {
        temp = -temp;
        printf("Binary representation of absolute value: ");
    } else {
        printf("Binary equivalent: ");
    }

    while (temp > 0) {
        binary_array[i] = temp % 2;
        temp = temp / 2;
        i++;
    }

    for (int j = i - 1; j >= 0; j--) {
        printf("%d", binary_array[j]);
    }
    printf("\n");

    return 0;
}