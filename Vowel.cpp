#include <iostream>
#include <string>
#include <algorithm>

int main() {
    std::string inputString = "Hello, World!";

    // Lambda function to count vowels
    auto countVowels = [](const std::string& s) {
        int count = 0;
        for (char c : s) {
            if (std::string("aeiouAEIOU").find(c) != std::string::npos) {
                count++;
            }
        }
        return count;
    };

    int vowelCount = countVowels(inputString);
    std::cout << "Number of vowels in the string: " << vowelCount << std::endl;

    return 0;
}
