package ch01.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        double doubleValue = 2147483648D;
        System.out.println(doubleValue);
        int intValue = (int)doubleValue;
        System.out.println(intValue);
    }
}
