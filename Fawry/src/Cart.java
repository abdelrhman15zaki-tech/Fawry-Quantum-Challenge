import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Cart {
    private Map<Products, Integer> list = new HashMap<>();
    public void add(Products product, int quantity) {
        boolean flag = true;
        if (product.getExpirationdate() == null) {
            if (product.getQuantity() <= 0) {
                System.out.println(product.getName()+" Out of stock");
            } else {


                if(quantity>product.getQuantity()){
                    System.out.println("There are only "+product.getQuantity()+" of "+product.getName());
                    System.out.println("Will You take them ?(Type Y if yes or N if no)");

                    Scanner sc=new Scanner(System.in);
                    String answer=sc.next();
                    if(!(answer.equals("Y")||answer.equals("N"))){
                        boolean flag2=false;

                    while (flag2==false){
                        System.out.println("Invalid input (Please Enter Y or N)");
                        answer=sc.next();
                        if((answer.equals("Y")||answer.equals("N"))){
                            flag2=true;
                    }
                    }
                    }
                    if(answer.equals("Y")){list.put(product, product.getQuantity());
                    product.setQuantity(0);}
                    else if(answer.equals("N")){
                        System.out.println(product.getName()+" has been removed");
                    }


                }
                else{list.put(product, quantity);
                }
            }
        } else {
            if (product.getQuantity() <= 0) {
                System.out.println(product.getName()+" Out of stock");
                flag = false;
            }
            if (product.getExpirationdate().compareTo("2026-04-09") < 0) {
                System.out.println(product.getName()+" is Expired");
                flag = false;
            }
            if (flag == true) {
                if(quantity>product.getQuantity()){
                    System.out.println("There are only "+product.getQuantity()+" of "+product.getName());
                    System.out.println("Will You take them ? (Type Y if yes or N if no)");
                    Scanner sc=new Scanner(System.in);
                    String answer=sc.next();
                    if(!(answer.equals("Y")||answer.equals("N"))){
                        boolean flag3=false;

                        while (flag3==false){
                            System.out.println("Invalid input (Please Enter Y or N)");

                            answer=sc.next();
                            if((answer.equals("Y")||answer.equals("N"))){
                                flag3=true;
                            }
                        }
                    }
                        if(answer.equals("Y")){list.put(product, product.getQuantity());
                            product.setQuantity(0);}
                        else if(answer.equals("N")){
                            System.out.println(product.getName()+" has been removed");
                        }


                }
                else{
                list.put(product, quantity);
                }
            }
        }
    }

    public Map<Products, Integer> getList() {
        return list;
    }
}
