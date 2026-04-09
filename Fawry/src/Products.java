import java.time.LocalDate;

public class Products {

    private String name;
    private double price;
    private int quantity;
    private String expirationdate;

    private double shippingfees;
    private double weight;

    public Products(String name, double price, int quantity, String expirationdate, double shippingfees, double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationdate = expirationdate;
        this.shippingfees = shippingfees;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    public double getShippingfees() {
        return shippingfees;
    }

    public void setShippingfees(double shippingfees) {
        this.shippingfees = shippingfees;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
