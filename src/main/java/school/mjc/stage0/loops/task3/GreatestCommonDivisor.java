package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcd = 1;

        if(first == 0){
            gcd = second;
        }

        if(second == 0){
            gcd = first;
        }

        for (int i = 1; i <= first && i <= second; i++) {

            if (first % i == 0 && second % i == 0)
                gcd = i;

        }

        System.out.println(gcd);
    }

    public static void main(String[]args){
        GreatestCommonDivisor cd = new GreatestCommonDivisor();
        cd.printGCD(0,30);
    }

    //Write a program that will print the Greatest Common Divisor (GCD) of two numbers given as method arguments:
}
