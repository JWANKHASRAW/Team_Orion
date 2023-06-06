public class IsPrimeSorina {
    public static void main(String[] args) {
        int k = 5;
        boolean isPrime = true;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("number " + k + " is prime");
        } else {
            System.out.println("number " + k + " is not prime");
        }
    }
}