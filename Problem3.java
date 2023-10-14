//Im Tired
//The Prime factors of 13,195 are 5,7,13, and 29
//What is the largest prime factor of 600,851,475,143

public class Problem3 {
    public static void main(String[] args) {
        double num = 600851475143.;
        double largestPrimeFactor = 2; // Start with the smallest prime

        while (num > largestPrimeFactor) {
            if (num % largestPrimeFactor == 0) {
                num = num / largestPrimeFactor;
            } else {
                largestPrimeFactor++;
            }
        }
        System.out.println(largestPrimeFactor);
    }
}
