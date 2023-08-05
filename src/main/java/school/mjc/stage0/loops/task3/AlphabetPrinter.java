package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char ch;

        for (ch = 'a'; ch <= 'z'; ch++)
            System.out.println(ch);
    }

    public static void main(String[]args){
        AlphabetPrinter ap = new AlphabetPrinter();
        ap.printAlphabet();
    }

//Write a program that will write to console English alphabet.
}
