#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*Function Prototypes*/
int partOne(int a);
void partTwo();
void partThree();

/*
FUNTION: This is a control switch function
it prompts the user for input and based on user input
it then calls the appropriate function to complete the task
IN: no input parameters
OUT: no return variables
*/
int main()
{

	srand(time(NULL));

	/*Variables*/
	int input = 0;
	int num = 0;
	int result = 0;

	/*While the User hasn't entered 5*/
	do
	{
		/*User Prompts*/
		printf("Please Select a number from the following options:");
		printf("\n1. Q1");
		printf("\n2. Q2");
		printf("\n3. Q3");
		printf("\n4. Exit\n");

		/*User Input*/
		scanf("%d", &input);

		/*If statement control switch --
		 *If user input is equal to 1 -> call part one
		 *etc...
		 */
		if (input == 1)
		{
			printf("Enter a number: ");
			scanf("%d", &num);

			result = partOne(num); // call function and return result
			printf("Result: %d\n", result);
			printf("\n");
		}
		else if (input == 2)
		{
			partTwo(); // call function
			printf("\n");
		}
		else if (input == 3)
		{
			partThree(); // call function
			printf("\n");
		}
		else if (input != 4)
		{
			printf("Error: Please Select a number from the following options\n\n");
		}
	} while (input != 4 && input >= 1 || input <= 3);

	return 0;
}

/*
FUNTION: Takes in a int as a parameter passed in from main
asks the user for a second number, and an operation, preforms the
given operation on both of the numbers
and returns result back to main to be printed
IN: int operand variable
OUT: int sum variable
*/
int partOne(int a)
{
	int b = 0;
	char op = 0;
	int result = 0;

	// prompt user
	printf("Enter a second number: ");
	scanf("%d", &b);

	printf("Enter an operation: ");
	scanf(" %c", &op);

	// check for which operation
	if (op == '+')
	{
		result = a + b;
	}
	else if (op == '-')
	{
		result = a - b;
	}
	else if (op == '*')
	{
		result = a * b;
	}
	else if (op == '/')
	{
		result = a / b;
	}

	return result; // return result
}

/*
FUNTION: Allocating mem for an array (using malloc) given by the user,
populating it with random values, and outputing it
IN: N/A
OUT: N/A
*/
void partTwo()
{
	int *arr = NULL;
	int n = 0;
	int i = 0;

	// prompt user
	printf("Enter array size: ");
	scanf("%d", &n);

	arr = calloc(n, sizeof(int)); // allocate memory
	// check if successful
	if (arr == NULL)
	{
		printf("Error: Memory allocated unsuccessful");
		exit(1);
	}

	// populate array with random numbers
	for (i = 0; i < n; i++)
	{
		arr[i] = rand();
	}

	// print contents
	for (i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}

	free(arr); // free memory
}

/*
FUNTION: Allocating mem for a 2D array (using malloc) given by the user,
populating it with random values, and outputing it
IN: N/A
OUT: N/A
*/
void partThree()
{
	int rows = 0;
	int columns = 0;
	int **arr = NULL;
	int i = 0, j = 0;

	printf("Enter number of rows: ");
	scanf("%d", &rows);

	printf("Enter number of columns: ");
	scanf("%d", &columns);

	arr = calloc(rows, sizeof(int *)); // allocate memory for array of pointers
	if (arr == NULL)
	{
		printf("Memory allocation failed");
		exit(1);
	}

	for (i = 0; i < rows; i++)
	{
		arr[i] = calloc(columns, sizeof(int)); // allocate memory for each column
		if (arr[i] == NULL)
		{
			printf("Memory allocation failed");
			exit(1);
		}
	}

	for (i = 0; i < rows; i++)
	{
		for (j = 0; j < columns; j++)
		{
			arr[i][j] = rand(); // populate array with random numbers
		}
	}

	for (i = 0; i < rows; i++)
	{
		for (j = 0; j < columns; j++)
		{
			printf("%d ", arr[i][j]);	// print contents
		}
		printf("\n");
	}

	// free array of pointers
	for (i = 0; i < rows; i++)
	{
		free(arr[i]);
	}

	free(arr);
}
