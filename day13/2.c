#include <stdio.h>

int main() {
    int n;
    int sum = 0;
    float average;

    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) { 
        scanf("%d", &arr[i]);
        sum += arr[i]; 
        printf("\n");

    }

    average = (float)sum / n;

    printf("\nSum of array elements: %d\n", sum);
    printf("Average of array elements: %f\n", average);

    return 0;
}