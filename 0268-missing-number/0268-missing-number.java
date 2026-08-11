class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
//        LOGIC ---->
//        Create a HashSet
//                ↓
//        Put every number from nums into it
//                ↓
//        Loop from 0 to n
//                ↓
//        Ask: "Does HashSet contain this number?"
//                ↓
//        No → that's the missing number
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna