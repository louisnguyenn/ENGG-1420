#include <iostream>
#include <cassert>

class Calculator {
public:
    int add(int a, int b) {
        return a + b; // Bug: Should be return a + b;
    }
    int subtract(int a, int b) {
        return a - b; // Bug: Should be return a - b;
    }
};

int main() {
    Calculator calc;

    // Test the add method
    int resultAdd = calc.add(5, 3);
    std::cout << "5 + 3 = " << resultAdd << std::endl;

    // Test the subtract method
    int resultSubtract = calc.subtract(10, 4);
    std::cout << "10 - 4 = " << resultSubtract << std::endl;

    // Test Case 1: Adding two positive numbers
    assert(calc.add(5, 3) == 8);

    // Test Case 2: Subtracting a smaller number from a larger number
    assert(calc.subtract(10, 4) == 6);

    return 0;
}
