#include<iostream>

using namespace std;

long long factorial(int n) {
    long long result = 1;
    for(int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

int main() {
    int num;
    cout << "Enter a positive integer: ";
    cin >> num;
    if(num < 0) {
        cout << "Error! Factorial of a negative number doesn't exist.";
    } else {
        cout << "Factorial of " << num << " = " << factorial(num);
    }
    return 0;
}