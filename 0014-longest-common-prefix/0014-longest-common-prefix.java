class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char currentChar = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // If the current string is shorter
                // OR the character doesn't match,
                // return the prefix found so far.
                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return first.substring(0, i);
                }
            }
        }

        // If all characters matched, the first string is the common prefix.
        return first;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna