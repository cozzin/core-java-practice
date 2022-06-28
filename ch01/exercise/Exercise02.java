package ch01.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        for (int input : new int[]{-1231, -1, 0,  1, 359, 360}) {
            System.out.printf("input: %d, mod: %d, floorMod: %d", input, input % 360, Math.floorMod(input, 360));
            System.out.println();
        }
    }
}
