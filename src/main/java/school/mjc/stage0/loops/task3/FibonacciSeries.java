package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int firstElement = 0;
        int secondElement = 1;
        for (int i = 1; i <= lastFibonacci; i++) {   //starts from i = 2 because we have first 2 elements for 0 and 1
            System.out.println(firstElement);
            int thirdElement = firstElement + secondElement;

            firstElement = secondElement;
            secondElement = thirdElement;

        }

    }




    //Write a program that will display the first n terms of Fibonacci series, each on new line:
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
}
