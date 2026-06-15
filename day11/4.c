#include <stdio.h>

int fFactorial(int n) {
    int factorial = 1;
    
    if (n < 0) {
        return -1; 
    }
    
    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }
    
    return factorial;
}

int main() {
    int num;
    int result;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    result = fFactorial(num);

    if (result == -1) {
        printf("Factorial of a negative number doesn't exist.\n");
    } else {
        printf("Factorial of %d = %d\n", num, result);
    }

    return 0;
}