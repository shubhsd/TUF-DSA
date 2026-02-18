
// IF - ELSE

// Prog 1 - Given an age, print "adult" if age > 18, or print "teen"
// #include<iostream>
// using namespace std;

// int main() {
//     int age;
//     cin >> age;

//     if(age > 18) {
//         cout << "Adult";
//     }else {
//         cout << "Teen";
//     }
//     return 0;
// }

// Program 2 - Given an integer age, 
// if age > =18, print adult
// if age <18 and age >=10, print terminate_handler
// if age < 10 print child

#include<iostream>
using namespace std;

int main() {
    int age;
    cin >> age;

    if(age >= 18) {
        cout << "Adult";
    }
    else if(age < 18 && age >=10) {
        cout << "Teen";
    }
    // else if (age < 10)
    // {
    //     cout << "Child";
    // }or
    else {
      cout << "Child";  
    }
    return 0;
}