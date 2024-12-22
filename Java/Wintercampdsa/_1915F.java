import java.util.*;
import java.util.stream.*;

public class _1915F {
    static class OrderedSet {
        private TreeSet<Integer> set;

        public OrderedSet() {
            set = new TreeSet<>();
        }

        public void insert(int value) {
            set.add(value);
        }

        public int size() {
            return set.size();
        }

        public int orderOfKey(int value) {
            return set.headSet(value).size();
        }

        public void clear() {
            set.clear();
        }
    }

    static int t, n;
    static List<Pair> arr;
    static long ans;
    static OrderedSet st;

    static class Pair implements Comparable<Pair> {
        int first, second;

        Pair(int second, int first) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.first, other.first);
        }
    }

    static void solve(Scanner scanner) {
        n = scanner.nextInt();
        arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(new Pair(scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(arr);
        ans = 0;
        st.clear();

        for (Pair p : arr) {
            ans += st.size() - st.orderOfKey(p.second);
            st.insert(p.second);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        st = new OrderedSet();

        while (t-- > 0) {
            solve(scanner);
        }
    }
}
