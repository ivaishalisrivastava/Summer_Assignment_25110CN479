#include <stdio.h>
#include <limits.h>

int main() {
    int n;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    if (n < 2) {
        printf("Array must contain at least 2 elements to find the second largest.\n");
        return 1;
    }

    int arr[n];

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        printf("\n");
    }

    int largest = NULL;
    int seclarge = NULL;

    for (int i = 0; i < n; i++) {
        if (arr[i] > largest) {
            seclarge = largest;
            largest = arr[i];
        } else if (arr[i] > seclarge && arr[i] != largest) {
            seclarge = arr[i];
        }
    }

    if (seclarge == NULL) {
        printf("There is no second largest element (all elements are equal).\n");
    } else {
        printf("The largest element is: %d\n", largest);
        printf("The second largest element is: %d\n", seclarge);
    }

    return 0;
}