class SeasonalCoffee extends Coffee {
    String season;

    public SeasonalCoffee(String name, double price, char sizeOption, String season) {
        super(name, price, sizeOption);
        this.season = season;
    }

    public String getseason() {
        return season;
    }

    public void setseason(String season) {
        this.season = season;
    }

    @Override
    public void calcPrice(double price) {
        this.price = price;

        if (this.sizeOption == 'S') {
            this.price += 3.50; // Add 3.50 if sizeOption is 'S'
        } else if (this.sizeOption == 'M') {
            this.price += 5.50; // Add 2.50 if sizeOption is 'M'
        } else if (this.sizeOption == 'L') {
            this.price += 7.50; // Add 1.50 if sizeOption is 'L'
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.getName() + "\nPrice: " + this.getPrice() + "\nSize: " + this.sizeOption()
                + "\nSeason: " + this.getseason());
    }

}