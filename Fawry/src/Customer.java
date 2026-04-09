import java.util.HashMap;
import java.util.Map;

public class Customer {
    private double balance;
    private Cart cart;

    public Customer(double balance, Cart cart) {
        this.balance = balance;
        this.cart = cart;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cart getCart() {
        return cart;
    }

    public void checkout(){
        if(this.cart.getList().size()==0)
            System.out.println("Empty Cart");
        else{

            double[] totals = {0.0, 0.0,0.0};
            this.cart.getList().forEach((key, value) -> {

                totals[0]+= key.getPrice()*value;
                totals[1]+=key.getShippingfees()*value;
                totals[2]+=key.getWeight()*value;
            });
            double subtotal=totals[0];
            double shipping=totals[1];
            double totalWeight=totals[2];

            double total= subtotal +shipping;


        if(total>this.balance)
            System.out.println("Insufficient Balance");
        else{
            System.out.println("** Shipment notice **");
            this.cart.getList().forEach((key, value) -> {
                if(key.getShippingfees()==0){return;}
                System.out.println(value+"x "+key.getName()+"       "+key.getWeight()*value+"g");

            });
            System.out.println("Total package weight "+totalWeight/1000 +"kg");
            System.out.println("** Checkout receipt **");
            this.cart.getList().forEach((key, value) -> {
                System.out.println(value+"x "+key.getName()+"       "+key.getPrice()*value);

            });
            System.out.println("Subtotal        "+subtotal);
            System.out.println("Shipping        "+shipping);
            System.out.println("Total           "+total);
        }
    }

}
}
