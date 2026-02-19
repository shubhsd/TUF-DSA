#include <iostream>
using namespace std;

// 1st program - Single variable
// int main () {
//     int bDate;
//     // cout << "Enter your birth date" << endl;
//     cin >> bDate;
//     cout << bDate; 
//     return 0;
// }

// 2nd program - Muliple variable, say same datatype
// int main () {
//     int bDate;
//     int num;  
//     cin >> bDate ;
//     cin >> num ;
//     cout << bDate << endl ; 
//     cout << num ; 
//     return 0;
// }

// 3rd program - character  - will work on single digits so will o/p 1 and 3 even if our inputs are 1319 23
// int main () {
//     char bDate;
//     char num;  
//     cin >> bDate >> num ;
//     cout << bDate << endl << num; 
//     return 0;
// }

// 4th Program - String - Will end up assuming numbers as string
// int main () {
//     string bDate;
//     string num;  
//     cin >> bDate >> num ;
//     cout << bDate << endl << num; 
//     return 0;
// }

// 5th program - Taking string input and printing it
// int main () {
//     string name;
//     cin >> name; //This is string
//     cout << name; 
//     return 0;
// } //This program will output - This as string does not include space. Hence This will be considered as 1st string, is as 2nd and so on 

// 6th program - Taking entir string input and printing it
// For this case we use getline(cin, str)
int main () {
    string str1, str2;
    getline(cin, str1);
    getline(cin, str2);
    cout << str1 << endl << str2;
    return 0;
}
