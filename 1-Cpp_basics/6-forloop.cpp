// Print all numbers from 1 to 10
// #include <iostream>
// using namespace std;

// int main() {
//     for(int i = 1; i<=10; i++) {
//         cout << i << endl;
//     }
//     return 0;
// }

// Problem 2 : Print all numbers in reverse order 10-1
// #include <iostream>
// using namespace std;

// int main() {
//     for(int i = 10; i>=1; i--) {
//         cout << i << endl;
//     }
//     return 0;
// }   

//  /Problem 3: Print all nums from 10 to 1 but just even numbers

// #include <iostream>
// using namespace std;

// int main() {
//     // Method : 1
//     // for(int i = 10; i>=1; i--) {
//     //     if(i % 2 == 0) {
//     //         cout << i << endl;
//     //     }
//     // }
//     // Method : 2
//     for (int i = 10; i >= 1; i = i-2) {
//         cout << i << endl;
//     }
//     return 0;
// }  

// Problem 4 : Print all the multiples of 5 till 100
#include <iostream>
using namespace std;
int main() {
    for(int i = 5; i<=100; i = i+15) {
        cout << i << endl;
    }
    return 0;
}  