#include <stdio.h>

int main() {
    int n, i;
    int t1 = 0, t2 = 1, nextTerm = 0;

    printf("Enter the position (n): ");
    if (scanf("%d", &n) != 1 || n < 1) {
        return 1;
    }

    if (n == 1) {
        nextTerm = t1;
    } else if (n == 2) {
        nextTerm = t2;
    } else {
        for (i = 3; i <= n; ++i) {
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
    }

    printf("The %d-th Fibonacci term is: %d\n", n, nextTerm);

    return 0;
}