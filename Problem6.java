/*
 * The sum of the squares of the first ten natural numbers is:
 * (1^2)+(2^2)+(3^2)+(4^2)...(10^2) = 385
 * 
 * The square of the sum of the first ten natural number is:
 * (1+2+3+4...+10)^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025-285 = 2640
 * 
 * Find the difference between the sum of the squares of the first one hundred natural
 * numbers and the square of the sum
 */

public class Problem6 {
    public static void main(String[] args){
        final int LENGTH = 100;
        int difference = findSquaredSum(LENGTH)-findSum(LENGTH);
        System.out.println(difference);
    }
    public static int findSum(int len){//Finds the sum of all of the numbers sqrd
        int sum = 0;
        for (int x = 1; x < len+1; x++){
            sum += x*x;
        }
        return sum;
    }
    public static int findSquaredSum(int len){//Finds the sqrd sum of all the numbers
        int sum = 0;
        for (int x = 1; x < len+1; x++){
            sum += x;
        }
        return sum * sum;
    }
}
