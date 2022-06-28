package ch01.exercise;

import java.math.BigInteger;

public class Exercise06 {
    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }

    private static BigInteger factorial(int input) {
        BigInteger result = BigInteger.valueOf(1);

        for(int i = 1; i <= input; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
