import java.util.*;

class Solution {
    public int largestInteger(int num) {

        char[] str = Integer.toString(num).toCharArray();

        List<Character> odd = new ArrayList<>();
        List<Character> even = new ArrayList<>();

        for (char s : str) {
            if ((s - '0') % 2 == 0) {
                even.add(s);
            } else {
                odd.add(s);
            }
        }

        odd.sort(Collections.reverseOrder());
        even.sort(Collections.reverseOrder());

        StringBuilder res = new StringBuilder();
        int oddIndex = 0, evenIndex = 0;

        for (char s : str) {
            if ((s - '0') % 2 == 0) {
                res.append(even.get(evenIndex++));
            } else {
                res.append(odd.get(oddIndex++));
            }
        }

        return Integer.parseInt(res.toString());
    }
}