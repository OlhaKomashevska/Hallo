package Aufgabe2;

public class FizzBuzz {
    public static void makeFizzBuzz() {
        int index = 100;
        for (int i = 1; i < index; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
