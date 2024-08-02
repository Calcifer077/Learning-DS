public class check_if_a_number_appears_atleast_twice {
    public static boolean checkNumberIfItAppearsAtleastTwice(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(checkNumberIfItAppearsAtleastTwice(arr));
    }
}
