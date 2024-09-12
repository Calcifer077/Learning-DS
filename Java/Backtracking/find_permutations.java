public class find_permutations {
    public static void findPermutations(String str, String ans) {
        // Base case
        // If the reach zero. have exhausted all of the string. Simply print answer
        // ('ans').
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        // At each index, we make each element come at that position.
        // Suppose str = "abc"
        // We first make "a" come at first position and ask "b" and "c" to come at 2 or
        // 3.
        // Similarly we do for "b" and "c"
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // Decreasing the length of string by 1 and calling the function recusivaly.
            // "abcde" => "ab" + "" + "de"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // Here, 'newStr' is another string with decreased length by 1 and 'curr' is
            // added to 'ans'.
            findPermutations(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}