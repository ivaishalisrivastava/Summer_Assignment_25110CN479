#include <stdio.h>

int main() {
    int arr[100];
    int size;

    printf("Enter the size of the array: ");
    scanf("%d", &size);
   
    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("\nDuplicate elements in the array are:\n");
    for (int i = 0; i < size; i++) {
        for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    printf("%d\n", arr[i]);
                 
                }
        }
    }

    return 0;
}