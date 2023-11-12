package DSA;

import java.util.*;

class DiamondPrintingBasic {
    // Function to generate the diamond pattern
    public static String[] diamondPrinting(int n) {
        String[] pattern = new String[2 * n - 1];

        // Generating the upper part of the diamond
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= n - i; j++) {
                row.append(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                row.append("*");
            }
            pattern[i - 1] = row.toString();
        }

        // Generating the lower part of the diamond
        for (int i = n + 1; i <= 2 * n - 1; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i - n; j++) {
                row.append(" ");
            }
            for (int k = 1; k <= (2 * n - i) * 2 - 1; k++) {
                row.append("*");
            }
            pattern[i - 1] = row.toString();
        }

        return pattern;
    }

    // Main function to take input and print the pattern
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

        sc.close();
    }
}
