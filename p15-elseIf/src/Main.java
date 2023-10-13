public class Main {
    public static void main(String[] args) {
        // else if
        int age = 13;
        boolean isAdult = age >= 18;
        boolean isChild = age < 12;

        if (isAdult) {
            System.out.println("You are an adult");
        } else if (isChild) {
            System.out.println("You are a child");
        } else {
            System.out.println("You are a teenager");
        }
    }
}