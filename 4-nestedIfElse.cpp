/*
You are given 3 integers a,b and c.
print which of these integer is largest.
If two or more integers are equal and are largest the program should indicate that as well
*/

#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    if(a>=b) {
        if(a>=c) {
            cout << "A is largest";
        }else {
            cout << "B is largest";
        }
    }
    else if(b>=c) {
        cout << "B is the largest";
    }
    else {
        cout << "C is the largest";
    }
}