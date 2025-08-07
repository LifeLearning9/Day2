**Day 2**:**: Given a string s, reverse the order of words.**
A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.

**Note**:s may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
Reduce multiple spaces between words to a single space in the output.

**Example Test Cases**
Test Case 1: Input:s = "the sky is blue"   Output:"blue is sky the"
Test Case 2: Input:s = " hello world "      Output:"world hello"

**Intuition**
The idea is to split the sentence into words, remove extra spaces, and then reverse the order of the words.
Instead of reversing the whole string character by character, we preserve the words and only change their positions.
This is useful when word order matters more than the exact character positions, such as in natural language processing or formatting tools.

**Algorithm**
1.Input a string s.
2.Trim the string to remove leading and trailing whitespace.
3.Split the string using regex \\s+ to handle multiple spaces.
4.Use a loop or StringBuilder to append the words in reverse order.
5.Return the final reversed sentence.

**Time and Space Complexity**
Let N be the length of the input string.
**Time Complexity**: O(N)   Traverses the entire string once to split and again to reverse and build the result.
**Space Complexity**: O(N)   Stores the split words and the final result separately.
