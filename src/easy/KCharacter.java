package easy;

public class KCharacter {
    public static void main(String[] args) {
        int k = 5;
        System.out.println(kthCharacter(k));
    }

    private static char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("abc");
        if (k == 1) {
            return 'a';
        }
        while (word.length() < k) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                c = (c == 'z') ? 'a' : (char) (c + 1);
                sb.append(c);
            }
            word.append(sb);
            if (word.length() >= k) {
                return word.toString().charAt(k - 1);
            }
        }
        return 0;
    }
}
