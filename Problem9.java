/*
 * A pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *                                                          a^2 + b^2 = c^2
 * for example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * find the product of abc
 */

public class Problem9 {
    public static void main(String[] args){
        final int MAX = 1000;
        for (int a=1;a<MAX;a++){//Triple nested for loops to find the a,b,and c values. The is triplet function is called every single time one of these values change
            for (int b=1;b<MAX;b++){
                for (int c=1;c<MAX;c++){
                    if (istriplet(a, b, c)){
                        int product = a*b*c;
                        System.out.println(product);
                        return;//If they are true, prints the product, then stops the code
                    }
                }
            }
        }
    }
    public static boolean istriplet(int a,int b,int c){
        final int GOAL = 1000;
        if ((a*a)+(b*b) == (c*c) && a+b+c == GOAL){//Is it part of the pythagorean therum, and do the sum equal the goal
            return true;
        }else{
            return false;
        }
    }
}
