#include <stdio.h>

int main() {
    int n, search, flag = 0;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        printf("\n");
    }

    printf("Enter the element to search: ");
    scanf("%d", &search);

    for (int i = 0; i < n; i++) {
        if (arr[i] == search) {
            printf("Element found at index %d and Position %d\n", i, i + 1);
            flag = 1;
            break; 
        }
    }

    if (!flag) {
        printf("Element %d is not present in the array.\n", search);
    }

    return 0;
}