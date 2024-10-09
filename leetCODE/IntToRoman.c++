#include <bits/stdc++.h>
using namespace std;
class IntToRoman {
public:
    string intToRoman(int num) {
        // Define the Roman numeral symbols and their values.
        const pair<int, string> roman[] = {
            {1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, 
            {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, 
            {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}
        };

        string result = ""; // To store the Roman numeral result
        
        // Iterate through the array of values and symbols
        for (const auto &pair : roman) {
            // While the current number is greater than or equal to the current Roman numeral value
            while (num >= pair.first) {
                result += pair.second;  // Append the Roman numeral symbol
                num -= pair.first;      // Subtract the Roman numeral value from the number
            }
        }
        
        return result;  // Return the Roman numeral string
    }
};

int main() {
    IntToRoman sol;

    // Example 1
    int num1 = 3749;
    cout << sol.intToRoman(num1) << endl;  // Output: "MMMDCCXLIX"

    // Example 2
    int num2 = 58;
    cout << sol.intToRoman(num2) << endl;  // Output: "LVIII"

    // Example 3
    int num3 = 1994;
    cout << sol.intToRoman(num3) << endl;  // Output: "MCMXCIV"

    return 0;
}
