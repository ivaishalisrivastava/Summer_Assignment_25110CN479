#include <stdio.h>

void printFibonacci(int terms) {
    int first = 0, second = 1, next;

    if (terms <= 0) {
        printf("Please enter a positive number of terms.\n");
        return;
    }

    printf("Fibonacci Series: ");

    for (int i = 1; i <= terms; i++) {
        if (i == 1) {
            printf("%d", first);
            continue;
        }
        if (i == 2) {
            printf(", %d", second);
            continue;
        }
        
        next = first + second;
        first = second;
        second = next;
        
        printf(", %d", next);
    }
    printf("\n");
}

int main() {
    int n;

    printf("Enter the number of terms: ");
    scanf("%d", &n);

    printFibonacci(n);

    return 0;
}