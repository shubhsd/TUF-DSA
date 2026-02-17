#include <iostream>
using namespace std;

int main() {
    cout << "Hello World" << endl;
    // Int
    int numInt = INT_MAX; //around 10^9
    cout<< numInt<<endl;
    // long
    long num_long = LONG_MAX; //around 10^12
    cout<<num_long<<endl;

    long long bigNum = 1000000000000000000; //10^18

    //Float - saves till 7 decimal places
    float numFloat = 8.71111111331;
    cout<<numFloat<<endl;

    // Double - To save after 7 decimal places till 15 decimal places
    double numDouble = 15.321786378216;
    cout << numDouble <<endl;

    // Character - char
    char ch = 'A';
    cout << ch << endl;

    // String
    string str = "test name";
    cout << str << endl;
    return 0;
}
 