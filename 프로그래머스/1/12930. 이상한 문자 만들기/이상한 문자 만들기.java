import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder result = new StringBuilder();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            StringBuilder transformedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    transformedWord.append(Character.toUpperCase(c));
                } else {
                    transformedWord.append(Character.toLowerCase(c));
                }
            }

            result.append(transformedWord);
        }

        return result.toString();
    }
}
