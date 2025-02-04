package ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[10];
        for (int i = 0; i < names.length / 2; i++) {
            names[i] = "";
        }
        names[0] = "Fred";
        names[1] = names[0];
        System.out.println("names="+Arrays.toString(names));
        
        int[] primes = { 17, 19, 23, 29, 31 };
        primes = new int[] { 2, 3, 5, 7, 11, 13 };
        
        // 향상된 for 루프
        int sum = 0;
        for (int n : primes) {
            sum += n;
        }
        
        System.out.println("sum=" +sum);
        
        // 앨리어싱(별칭 지정, aliasing)과 복사
        int[] numbers = primes;
        numbers[5] = 42; // primes도 변경된다.
        System.out.println("primes=" + Arrays.toString(primes));
        
        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
        copiedPrimes[5] = 31; // primes를 변경하지 않는다.
        System.out.println("primes=" + Arrays.toString(primes));
        System.out.println("copiedPrimes=" + Arrays.toString(copiedPrimes));
    }

    void test1() {
        String[] names;
        names = new String[100];
    }

    void test2() {
        String[] names = new String[100];
        for (int i = 0; i < names.length; i++) {
            names[i] = "";
        }

        for (String name : names) {
            name.length();
        }

        int[] primes = { 2, 3, 5, 7, 11, 13 };
        primes = new int[] { 17, 19 };

        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);

        ArrayList<String> friends = new ArrayList<>(List.of(names));

        String[] namesB = friends.toArray(new String[0]);

        String[] authors = {"James Gosling", "Bill Joy", "SeongHo Hong"};
    }

    void test3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        int first = numbers.get(0);
    }
}
