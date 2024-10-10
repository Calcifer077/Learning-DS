// We have used 'sieve of eratosthenes' here.

public class find_prime_numbers_from_1_to_n {
    public static void findPrimeNumber(int n) {
        int prime[] = new int[n + 1];
        prime[0] = prime[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                if (prime[j] == 0) {
                    prime[j] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (prime[i] == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        findPrimeNumber(100);
    }
}