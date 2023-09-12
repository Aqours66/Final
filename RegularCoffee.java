class RegularCoffee extends Coffee implements Preparable {
    Double caffeineLevel;
    boolean hasMilk;

    public RegularCoffee(String name, double price, char sizeOption, Double caffeineLevel, boolean hasMilk) {
        super(name, price, sizeOption);
        this.caffeineLevel = caffeineLevel;
        this.hasMilk = hasMilk;
    }

    public double getcaffeineLevel() {
        return caffeineLevel;
    }

    public boolean hasMilk() {
        return hasMilk;
    }

    public void setcaffeineLevel(Double caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public void setMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nSize: " + this.sizeOption()
                + "\ncaffeineLevel: " + this.getcaffeineLevel() + "\nhasMilk: " + this.hasMilk());
    }

    public void calcPrice(double price) {
        this.price = price;

        if (this.hasMilk) {
            this.price += 2.50; // Add 2.50 if it has milk
        }

        if (this.caffeineLevel > 0.50) {
            this.price += 3.50; // Add 3.50 if caffeine level exceeds 0.50
        }
    }

    public void displayIngredients() {

        System.out.println("Ingredients: Coffee ");
    }

    public void displayDirections() {
        System.out.println("Directions: Here ");
    }
}