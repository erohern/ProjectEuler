/*
 * A palindromic number reads the same both ways. The largest palindrome
 * made from the product of two 2-digit numbers is 9009 = 91*99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers
 */

 //Approach three digit numbers
 //
 public class Problem4{
    public static void main(String args[]){
        int oldSum;
        int newSum = 0;
        for (int x=100;x<1000;x++){
            for (int y=100;y<1000;y++){
                if (x!=y){
                    String sum = Integer.toString(x*y);
                    if (sum.length() == 6){
                        if (sum.charAt(0) == sum.charAt(5)
                        &&sum.charAt(1) == sum.charAt(4)
                        &&sum.charAt(2) == sum.charAt(3)){
                            if (x*y > newSum){
                                oldSum = newSum;
                                newSum = x*y;
                            }
                        }
                    }
                }
            }
        }
    System.out.println(newSum);
    }
 }