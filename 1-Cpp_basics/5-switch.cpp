// Switch is another way of writing if else

// Problem : Given the day number print which day it is of the week, assume week starts from Monday and ends on Sunday

#include <iostream>
using namespace std;

int main() {
    int day;
    cin >> day;
    switch (day) {
        case 1:
            // Note : we have to give tab space after case, otherwise it won't work
            cout << "Monday";
            break; // Break condition always exits the outer loop, here in our case it's switch condition.
        case 2:
            cout <<  "Tuesday";
            break;
        case 3:
            cout << "Wednesday";
            break;
        case 4:
            cout << "Thursday";
            break;
        case 5:
            cout << "Friday";
            break;
        case 6:
            cout << "Saturday";
            break;
        case 7:
            cout << "Sunday"; 
            break;
        default: 
            cout << "Invalid";
        }
}

// Here let's say we input 7 so in switch it will automatically go to case 7.

// After every case we have to add break keyword