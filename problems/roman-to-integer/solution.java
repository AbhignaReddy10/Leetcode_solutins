class Solution {
    public int romanToInt(String s) {
       HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

    int result = 0; // initialize the result to 0
        for (int i = 0; i < s.length(); i++) { // loop through the charcters
            // Get integer at character in the map
            int current = map.get(s.charAt(i));
            
            // If next character exists and is larger, subtract current value
            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        
        return result;
    }
}
    
