#include <stdio.h>

int fibonacci(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int term;

    printf("Enter the number of terms: ");
    scanf("%d", &term);

    if (term < 0) {
        printf("Please enter a non-negative integer.\n");
    } else {
        printf("Fibonacci number at position %d is: %d\n", term, fibonacci(term));
    }

    return 0;
}