// Strings are basically character arrays under the hood.

#include <iostream>
using namespace std;

// int main () {
//     string str("Hello world");
//     cout << str;
//     return 0;
// }

// Method 2 to write string
// int main () {
//     string str = "Hello world 2";
//     cout << str << endl;
//     // size of string
//     cout << "Size is - " << str.size();
//     return 0;
// }

// Traversing a string
int main () {
    string str = "Hello world";
    int length = str.size();
    // We did length - 1 as last character in string is always null
    for(int i = 0; i<=length - 1; i++) {
        cout << str[i];
    }
    return 0;
}

// Note : Last character is always null