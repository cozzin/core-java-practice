package ch01.sec06;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        System.out.print(1000.0 / 3.0);
        System.out.printf("%8.2f\n", 1000.0 / 3.0);
        System.out.printf(" %,+.2f", 100000.0 / 3.0);
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("what is your name? ");
        String name = in.nextLine();
        System.out.print("How are you? ");
        if (in.hasNextInt()) {
            int age = in.nextInt();
            System.out.printf("Hello, %s. Next year, you'll be %d\n", name, age + 1);
        } else {
            System.out.printf("Hello, %s. Are you too young to enter an integer?", name);
        }
    }
}
