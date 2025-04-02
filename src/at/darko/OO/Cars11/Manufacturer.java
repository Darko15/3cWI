package at.darko.OO.Cars11;

public class Manufacturer {

    private String name;
    private String country;
    private double discount; // in percent

    public Manufacturer(String name, String country, double discount) {
        this.name = name;
        this.country = country;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

}
