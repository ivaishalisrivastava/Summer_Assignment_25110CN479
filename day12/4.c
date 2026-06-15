#include <stdio.h>

int isPerfect(int n) {
    if (n <= 1) {
        return 0;
    }

    int sum = 1; 
    for (int i = 2;  i <= n/2; i++) {
        if (n % i == 0) {
            sum = sum + i;
            }
        }
    

    if (sum == n) {
        return 1;
    } else {
        return 0;
    }
}

int main() {
    int num;

    printf("Enter an integer: ");
    scanf("%d", &num);

    if (isPerfect(num)==1) {
        printf("%d is a perfect number.\n", num);
    } else {
        printf("%d is not a perfect number.\n", num);
    }

    return 0;
}