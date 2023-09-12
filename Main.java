public class Main {
    public static void main(String[] args) {
        // Creating a RegularCoffee instance
        RegularCoffee regularCoffee = new RegularCoffee("Classic", 3.0, 'M', 100.0, true);
        regularCoffee.displayInfo(); // Displaying information about the regular coffee

        // Calculating the price of the regular coffee
        regularCoffee.calcPrice(3.0);
        System.out.println("New Price: " + regularCoffee.getPrice()); // Displaying the new price

        // Displaying ingredients and directions for the regular coffee
        regularCoffee.displayIngredients();
        regularCoffee.displayDirections();

        // Creating a SeasonalCoffee instance
        SeasonalCoffee seasonalCoffee = new SeasonalCoffee("Pumpkin Spice", 4.0, 'L', "Autumn");
        seasonalCoffee.displayInfo(); // Displaying information about the seasonal coffee

        // Calculating the price of the seasonal coffee
        seasonalCoffee.calcPrice(4.0);
        System.out.println("New Price: " + seasonalCoffee.getPrice()); // Displaying the new price
    }
}
