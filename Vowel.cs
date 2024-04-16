using System;

class Program
{
    static void Main(string[] args)
    {
        string inputString = "Hello, World!";
        
        // Lambda function to count vowels
        Func<string, int> countVowels = s =>
        {
            int count = 0;
            foreach (char c in s.ToLower())
            {
                if ("aeiou".Contains(c))
                {
                    count++;
                }
            }
            return count;
        };

        int vowelCount = countVowels(inputString);
        Console.WriteLine("Number of vowels in the string: " + vowelCount);
    }
}
