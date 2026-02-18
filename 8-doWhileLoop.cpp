#include<iostream>
using namespace std;

int main() {
    int i = 60;
    do{
      cout << i << endl;
      i = i+5;
    } while (i<=100);
    return 0;
}

// NOTE : In do while loop we first look for do then we check for a condition