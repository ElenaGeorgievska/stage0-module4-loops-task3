package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int i, t = 9;
        int sum = 0;

        for (i = 1; i <= lengthOfLastNumber; i++) {
            sum += t;
            t = t * 10 + 9;
        }

        System.out.println(sum);
    }

    public static void main(String[]args){
        NinesSum ns = new NinesSum();
        ns.calculateSum(6);
    }



    //Write a program that will display the sum of the series [ 9 + 99 + 999 + 9999 ... n]. i.e. n is lenghtOfLastNumber ex.  n=5 is 99999
   //9 + 99 + 999 + 9999 + 99999 = 111105
    //Where n is a number passed as a method argument, n is the last number which consists of "9" n times:
}

