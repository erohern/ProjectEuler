/*
 * By listing the first six prime numbers: 2,3,5,7,11 and 13, we can see that the 6th
 * prime is 13. What is the 10,001 prime number?
 */

public class Problem7{
    public static void main(String[] args){
        int numPrime = -1;
        for (int x=1;x<1000000;x++){
            if (isPrime(x)){
                numPrime += 1;
                if (numPrime == 10001){
                    System.out.println(x);
                    return;
                }
            }
        }
    }

    public static boolean isPrime(int num){
        if (num<1){
            return false;
        }
        for (int x = 2; x<num; x++){
            if (num%x==0){
                return false;
            }
        }
        return true;
    }
}
