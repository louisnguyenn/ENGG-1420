#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *ptr = NULL;
    int i = 0;
    int n = 0;
    int number = 0;
    int sum = 0;

    printf("Enter size of array: ");
    scanf("%d", &n);

    ptr = (int *)calloc(n, sizeof(int)); // allocate memory

    printf("Enter %d numbers: ", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &number);
        ptr[i] = number;
    }

    // compute sum
    for (i = 0; i < n; i++)
    {
        sum += ptr[i];
    }

    printf("Sum of array elements: %d", sum);

    free(ptr);

    return 0;
}
