// FUNCTIONS
#include <iostream>
using namespace std;
// Void is a keyword that tells function is going to do something but it won't return anything
void print() {
    cout << "Calling print function" << endl;
}

// int main() {
//     cout << "Before calling print function" << endl;
//     print();
//     cout << "After calling print function" << endl;
//     return 0;
// }

/* Prog : 2 - Write a program that accepts 4 numbers
 -and prints the summation of 2 numbers individually

 4 5 2 1
 o/p -> 9 and 3
*/
void inputTwoNumberAndPrintAddOfThem() {
    int num1, num2;
    cin >> num1 >> num2;
    cout << num1 + num2 << endl;
}

// int main () {
//     inputTwoNumberAndPrintAddOfThem();
//     inputTwoNumberAndPrintAddOfThem();
//     return 0;
// }

/* Prog : 3 - Write a program that return the addition of two number
*/

// Parameterized function
int sum(int num1, int num2) {
    int res = num1 + num2;
    return res;
}

// Passing value/copy
void explainPassByValueAndPassByReference(int x) {
    x = x + 10;
}
// Passing reference
void explainPassByReference(int &x) {
    x = x + 10;
}

void arrExample(int arr[]) {
    arr[0] = 100;
}

void arrExample1(int *arr) {
    arr[0] = 100;
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    arrExample(arr);
    arrExample1(arr);
    cout << arr[0] << " ARRAY 0 IS" << endl;
    int num = 6;
    explainPassByValueAndPassByReference(num);
    cout << num << endl;
    explainPassByReference(num);
    cout << "Pass by reference num -> " << num;
    // It gave 6 as output as we passed a copy, not a memory location

    // int res = sum(2,5);
    // cout << "Sum is -> " << res << endl; 
    // // or
    // cout << sum(3,7);
    return 0;
}
// Note : In case of arrays we can directly access updated value as it passes reference only not a copy
// Note : To pass the original memory location we use &



