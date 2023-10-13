public class Main {
    public static void main(String[] args) {
        double monthlyRent = 1000;
        double originalPriceOfProperty = 100000;
        System.out.println("The rental yield is: " + calculateRentalYield(monthlyRent, originalPriceOfProperty) + "%");
    }

    private static double calculateRentalYield(double monthlyRent, double originalPriceOfProperty) {
        return (monthlyRent * 12) / originalPriceOfProperty *100;
    }
}