package DSA;

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char ch : columnTitle.toCharArray()) {
            // Convert the character to its corresponding value in base-26
            int charValue = ch - 'A' + 1;

            // Update the result by shifting it left in base-26 and adding the new value
            result = result * 26 + charValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        System.out.println(solution.titleToNumber("A"));    // Output: 1
        System.out.println(solution.titleToNumber("AB"));   // Output: 28
        System.out.println(solution.titleToNumber("ZY"));   // Output: 701
    }
}

