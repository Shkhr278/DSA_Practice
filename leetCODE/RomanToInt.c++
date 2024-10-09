#include <iostream>
#include <unordered_map>
#include <string>

class RomanToInt {
public:
    int romanToInt(std::string s) {
        std::unordered_map<char, int> roman = {
            {'I', 1}, {'V', 5}, {'X', 10}, {'L', 50},
            {'C', 100}, {'D', 500}, {'M', 1000}
        };
        
        int total = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && roman[s[i]] < roman[s[i + 1]]) {
                total -= roman[s[i]];
            } else {
                total += roman[s[i]];
            }
        }
        
        return total;
    }
};

int main() {
    RomanToInt sol;

    // Example 1
    std::string s1 = "III";
    std::cout << sol.romanToInt(s1) << std::endl; // Output: 3

    // Example 2
    std::string s2 = "LVIII";
    std::cout << sol.romanToInt(s2) << std::endl; // Output: 58

    // Example 3
    std::string s3 = "MCMXCIV";
    std::cout << sol.romanToInt(s3) << std::endl; // Output: 1994

    return 0;
}
