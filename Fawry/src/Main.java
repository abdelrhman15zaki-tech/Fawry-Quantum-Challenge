import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Products cheese=new Products("Cheese",100,150,"2026-04-24",10,200);
        Products tv=new Products("TV",10000,43,null,250,4500);
        Products mobileScratch=new Products(" Mobile scratch ",23,400,null,0,0);
        Products salt= new Products("Salt", 5, 0, "2027-02-11",2.75,150 );
        Products biscuits=new Products("Biscuits",50,250,"2025-08-10",4.75,50);
        Cart cart=new Cart();
        Customer customer=new Customer(35000,cart);
        customer.getCart().add(biscuits,44);
        customer.getCart().add(mobileScratch,5);
        customer.getCart().add(cheese,10);
        customer.getCart().add(tv,1);
        customer.checkout();
    }
}