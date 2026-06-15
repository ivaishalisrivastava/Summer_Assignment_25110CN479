#include <stdio.h>

int isPalindrome(int n) {
    int reversed = 0;
    int original = n;

    while (n > 0) {
        reversed = (reversed * 10) + (n % 10);
        n /= 10;
    }

    if (original == reversed) {
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
        printf("%d is not a palindrome number.\n", num);
    } else if (isPalindrome(num)==1) {
        printf("%d is a palindrome number.\n", num);
    } else {
        printf("%d is not a palindrome number.\n", num);
    }

    return 0;
}