class Solution {
    public char findTheDifference(String s, String t) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
    }


    for (int i = 0; i < t.length(); i++) {
    char ch = t.charAt(i);
    if(map.containsKey(ch)){
        map.put(ch, map.get(ch) - 1);
        
        if (map.get(ch) == 0) {
                    map.remove(ch);
                }

    }
    else{
        return ch;
    }
    }
            return ' ';

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna