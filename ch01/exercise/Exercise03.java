package ch01.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int[] inputs = {-1231, 1111,  360};

        System.out.println(maxWithConditions(inputs));
        System.out.println(maxWithMath(inputs));
    }

    private static int maxWithConditions(int[] inputs) {
        checkPrecondition(inputs);

        int max = inputs[0];

        for (int input : inputs) {
            if (input > max) {
                max = input;
            }
        }

        return max;
    }

    private static int maxWithMath(int[] inputs) {
        checkPrecondition(inputs);

        int max = inputs[0];

        for (int input : inputs) {
            max = Math.max(input, max);
        }

        return max;
    }

    private static void checkPrecondition(int[] inputs) {
        if (inputs == null)
            throw new NullPointerException();
        if (inputs.length == 0)
            throw new IllegalArgumentException("inputs must be not empty");
    }

}
