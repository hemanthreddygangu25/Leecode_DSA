import java.util.Arrays;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        
        char[] originalDigits = Integer.toString(n).toCharArray();
        Arrays.sort(originalDigits);
        
        
        for (int i = 0; i < 31; i++) {
            int power = 1 << i;
            char[] powerDigits = Integer.toString(power).toCharArray();
            Arrays.sort(powerDigits);
            
            if (Arrays.equals(originalDigits, powerDigits)) {
                return true;
            }
        }
        
        return false;
    }
}
