public class find_subsets {
    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // Yes choice -> If the choice was 'yes' include that character to the final
        // answer.
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No choice -> If the choice was 'no' don't include that charcter to the final
        // answer and simply return that string.
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
