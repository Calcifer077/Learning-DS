public class roman_to_int {
    public static int romanToInt(String s) {
        int res = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'M') {
                res += 1000;
            } else if (ch[i] == 'D') {
                res += 500;
            } else if (ch[i] == 'C') {
                res += 100;
            } else if (ch[i] == 'L') {
                res += 50;
            } else if (ch[i] == 'X') {
                res += 10;
            } else if (ch[i] == 'V') {
                res += 5;
            } else if (ch[i] == 'I') {
                res += 1;
            }
        }

        for (int i = 0; i < ch.length - 1; i++) {
            if ((ch[i] == 'I' && ch[i + 1] == 'V') || (ch[i] == 'I' && ch[i + 1] == 'X')) {
                res -= 2;
            } else if ((ch[i] == 'X' && ch[i + 1] == 'L') || (ch[i] == 'X' && ch[i + 1] == 'C')) {
                res -= 20;
            } else if ((ch[i] == 'C' && ch[i + 1] == 'D') || (ch[i] == 'C' && ch[i + 1] == 'M')) {
                res -= 200;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
