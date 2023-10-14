/*
 * The following iterative sequence is defined for the set of positive integers:
 *  n->n/2(n is even)
 *  n->3n+1(n is odd)
 * using the rule above and starting with 13, we generate the following sequence:
 *  13->40->20->10->5->16->8->4->2->1
 * 
 * It can be seen that this sequence(Starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proven yet(Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 * 
 * Which starting nuber, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

public class Problem14 {
    public static void main(String[] args){
        long maxLength = 0;
        long numberWithMaxLength = 0;

        for (long i = 1; i < 1000000; i++) {
            long currentLength = findChainLength(i);
            System.out.println(findChainLength(i));
            if (currentLength > maxLength) {
                maxLength = currentLength;
                numberWithMaxLength = i;
            }
        }

        System.out.println(numberWithMaxLength);
        System.out.println(maxLength);
    }
    public static long rules(long number){
        long new_number;

        if (number%2 ==0){
            new_number = number/2;
        }else{
            new_number = (3*number) + 1;
        }

        return new_number;
    }
    public static long findChainLength(long start){
        long chain_length = 1; // starting number itself is part of the chain
        while (start != 1) {
            start = rules(start);
            chain_length++;
        }
        return chain_length;
    }
}
