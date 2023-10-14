// First Problem in project Euler and step to learning Java
//Good luck future Eli!

public class Problem1{
    public static void main(String args[]){
        int sum = 0;
        for (int x = 0; x<1000; x++){
            if (x%3 == 0 || x%5 ==0){
                sum += x;
                //System.out.println(divThree);
            }
        }
        System.out.println(sum);
    }
}