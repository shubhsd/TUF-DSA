// Arrays : defining similar variable name of same data type

// // Program : 1 -> print all elements of given array 
// #include<iostream>
// using namespace std;

// int main() {
//     int num[5] = {5, 7, 1, 4, 98};
//     for(int i = 0; i<=4; i++) {
//         cout << num[i] << endl;
//     }
//     return 0;
// }

// Program : 2 ->take input of 5 elements and then  print all elements of given array 
#include<iostream>
using namespace std;

int main() {
    int num[5];
    for(int i = 0; i<=4; i++) {
        cin >> num[i];
        cout << num[i] << endl;
    }
    return 0;
}