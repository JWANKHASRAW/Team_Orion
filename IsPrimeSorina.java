public class IsPrimeSorina {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // Number is divisible, hence not prime
            }
        }

        return true; // Number is prime
    }
}
