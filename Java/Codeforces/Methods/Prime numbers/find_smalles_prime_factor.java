public class find_smalles_prime_factor {
    public static void leastPrimeFactor(int n) {
        int[] least_prime = new int[n + 1];

        least_prime[1] = 1;
        // Here, we have used 'sieve of eratosthenes'
        for (int i = 2; i <= n; i++) {
            // If it is marked '0', it will mean that it is prime. We are making it as its
            // own smallest prime factor. Suppose '3' it is its own smallest prime factor.
            if (least_prime[i] == 0) {
                least_prime[i] = i;

                // If any number is prime and if you multiply it with any number more than 1, it
                // will not be prime.
                // If at that position it is marked 0. We are marking it as its smallest
                // divisor.
                // Suppose i = 2. 2 *2 is 4. Which is marked as 0. So, we will change it to 2,
                // which will be the smallest prime factor of it.
                for (int j = i * i; j <= n; j += i) {
                    if (least_prime[j] == 0) {
                        least_prime[j] = i;
                    }
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(least_prime[i]);
        }
    }

    public static void main(String[] args) {
        leastPrimeFactor(10);
    }
}