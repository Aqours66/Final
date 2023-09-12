abstract class Coffee {
    String name;
    double price;
    char sizeOption;

    Coffee(String name, double price, char sizeOption) {
        this.name = name;
        this.price = price;
        this.sizeOption = sizeOption;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public char sizeOption() {
        return sizeOption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSizeOption(char sizeOption) {
        this.sizeOption = sizeOption;
    }

    public abstract void calcPrice(double price);

    public abstract void displayInfo();

}
