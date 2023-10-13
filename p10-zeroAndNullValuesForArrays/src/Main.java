import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));

        double[] numbers2 = new double[5];
        numbers2[0] = 1.1;
        System.out.println(Arrays.toString(numbers2));

        boolean[] results = new boolean[5];
        results[0] = true;
        System.out.println(Arrays.toString(results));

        String[] names = new String[5];
        names[0] = "John";
        System.out.println(Arrays.toString(names));
    }
}