# 1. Getting ASCII value

If you use .charAt to get a string character and then do any arithmetic operation on it, it will be performed on their ASCII value

<pre> 
    public static int solve(String str1, String str2, int m) { 
        int res = 0; 
        for (int i = 0; i < m; i++) {
            res += Math.abs(str1.charAt(i) - str2.charAt(i));
        }
        return res;
    }
</pre>
