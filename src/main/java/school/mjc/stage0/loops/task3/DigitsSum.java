package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {

        //abs value of a number and convert int to string
        String e = String.valueOf(Math.abs(t));

        int sum = 0;

        for (int i = 0; i < e.length(); i++) {
            //get digit by digit and convert it to int
            sum = sum + Integer.parseInt(e.substring(i, i + 1));
        }

        System.out.println(sum);

    }



    //Write a program that will find the sum of digits of a given number passed as a method argument.
    // There are some tips: if you concatenate int with string you will be able to use string.length()
    // and iterate till the end. you shouldn't use other String methods, but length:
}
