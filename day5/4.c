#include <stdio.h>

int main() {
    int num, ori_num, largest_pf=1;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    ori_num = num;

    while (num % 2 == 0) {
        largest_pf = 2;
        num /= 2;
    }
    
    for (int i = 3; i * i <= num; i += 2) {
        while (num % i == 0) {
            largest_pf = i;
            num /= i;
        }
    }

    if (num > 2) {
        largest_pf = num;
    }

    if (largest_pf != 1 && ori_num > 1) {
        printf("The largest prime factor of %d is: %d\n", ori_num, largest_pf);
    } else {
        printf("%d does not have prime factors.\n", ori_num);
    }

    return 0;
}