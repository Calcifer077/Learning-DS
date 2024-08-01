public class isPrime
{   
    // public static boolean isPrime(int n){
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i = 2; i < n; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // Below approach is more optimized than the above one.
    public static boolean checkIfPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
	public static void main(String[] args) {
		System.out.println(checkIfPrime(50));
	}
}
