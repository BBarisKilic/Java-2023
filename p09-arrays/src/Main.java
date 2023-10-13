import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 9;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        double[] numbers2 = { 1, 2, 3, 4, 5 };
        numbers2[0] = 102;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        String[] names = { "John", "Mary", "Bob" };
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
    }
}