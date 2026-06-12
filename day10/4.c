#include <stdio.h>

int main() {
    int rows, i, j, space;

    printf("Enter the number of rows: ");
    scanf("%d", &rows);

    for (i = 1; i <= rows; i++) {
   
        for (space = 1; space <= rows - i; space++) {
            printf(" ");
        }

        char ch = 'A';
        for (j = 1; j <= i; j++) {
            printf("%c", ch);
            ch++;
        }

        for (j = 1; j < i; j++) {
            printf("%c", ch);
            ch--;
        }

        printf("\n");
    }

    return 0;
}