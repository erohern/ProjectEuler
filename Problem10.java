/*
 * The sum of the primes below 10 is 2+3+5+7 = 17
 * Find the Sum of all the primes below two million
 */

public class Problem10 {
    public static void main(String[] args){
        final long MAX = 2000000;
        long sumPrime = 2;
        for (long x=3;x<MAX;x+=2){
            if (isPrime(x)){
                sumPrime += x;
            }
        }
        System.out.println(sumPrime);
    }

    public static boolean isPrime(long num){
        if (num<2){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num%2==0){
            return false;
        }
        for (long x = 3; x<=Math.sqrt(num); x+=2){//only goes by incraments of 2 because an even number cannot be prime
            if (num%x==0){
                return false;
            }
        }
        return true;
    }
}
