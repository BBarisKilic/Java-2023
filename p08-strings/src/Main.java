public class Main {
    public static void main(String[] args) {
        // String
        String firstName = "Lorem";
        String lastName = "Ipsum";
        String space = " ";
        String name = firstName + space + lastName;
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(space.isEmpty());
        System.out.println(space.isBlank());
        System.out.println(" a ".trim());
    }
}