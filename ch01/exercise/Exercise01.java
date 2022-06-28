package ch01.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        for (int input : new int[]{2, 10, 15}) {
            System.out.println(Integer.toBinaryString(input));
            System.out.println(Integer.toOctalString(input));
            System.out.println(Integer.toHexString(input));
            System.out.println(Float.toHexString(-input));
            System.out.println();
        }
    }
}
