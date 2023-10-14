/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 *to 10 without any remainder.
 *
 *What is the smallest positive number that is evenly divisible by all of the numbers 
 *from 1 to 20
 */

public class problem5 {
    public static void main(String[] args){
        int numberRepeat = 0;//Number of times that it is divisable with no remainder
        for (int x=1;x<1000000000;x++){//Initial loop that checks through a billion numbers(Not Optimized)
            for (int y=1;y<21;y++){//Checks to see if the number is divisable from 1-20
                if(x%y==0){//Remainder?
                    numberRepeat += 1;
                }else{
                    numberRepeat = 0;//If there is a remainder reset
                }
                if (numberRepeat == 20){//Checks to see if completed
                    System.out.println(x);
                    return;
                }
            }
        }
    }
}
