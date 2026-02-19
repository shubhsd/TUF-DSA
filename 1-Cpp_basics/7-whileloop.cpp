// WHILE LOOP : Another way to write for loops

// Problem : Print all nums between 1 to 100 multiples of 5
#include<iostream>
using namespace std;

int main() {
    int i = 5;
    while(i<=100) {
        cout << i << endl;
        i = i + 10;
    }
    return 0;
}