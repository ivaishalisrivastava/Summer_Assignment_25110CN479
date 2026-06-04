#include <stdio.h>

int main() {
    int num1, num2, a, b, temp, gcd, lcm;

    printf("Enter two integers: ");
    if (scanf("%d %d", &num1, &num2) != 2) {
        return 1;
    }

    a = (num1 < 0) ? -num1 : num1;
    b = (num2 < 0) ? -num2 : num2;

    int tempA = a;
    int tempB = b;

    while (tempB != 0) {
        temp = tempB;
        tempB = tempA % tempB;
        tempA = temp;
    }
    
    gcd = tempA;

    if (gcd == 0) {
        lcm = 0;
    } else {
        lcm = (a / gcd) * b;
    }

    printf("The LCM of %d and %d is: %d\n", num1, num2, lcm);

    return 0;
}