************* NOTE THAT THE CODE CONSIDER THE DAY THAT THE PROGRAM IS RUNING AT IS 2026-4-9 ***************
--------------------------------------------------------
I created a class named Products and its attributes are name,price,quantity,expirationdate,shippingfees and weight

Products that don`t have expiration date such as TV their expiration date is null
products that are not to be shipped their shipping fees is 0 and we neglet their weight and make it zero
i made a constructor that take all of the data and made getters and setters
------------------------------------------------------
********** Class Cart **************
the class just has a HashMap so i could use it like a dictionary its key is the product and its value is the number of that product 
i created a function called add to add products to the cart 
the add function check if the product has an expiration date if not it checks if there is any of the product or no if there is none of that product left if prints "Out of Stock" 
if the product does have an expiration date it checks if it is expired or not it checks them by comparing the expiration date with the current day it compares the two string by "lexicographical order" . it also checks if it is out of stock or not 
in either cases if the product has an expiration date or not it checks if the desired quantity of the product is in the stock or not -----> Example :if the user wants 8 mobile scratch but the is jsut 5 of them the program make the user chooses if he want to get all of the remaining 5 or dont get any of the mobile scratch it checks that by taking an input from the user that is Y is yes or N for no if the user write none of these it prints "Invalid input" 
-------------------------------------------------------------------
********************* Class Customer **************************
It has balance and a cart (i used composition)
i made a constructor that takes the attributes and made getters and setters
i made a method called checkout it checks if the cart is empty or not if its empty it prints"Empty Cart"
if not empty it loops through the hashmap and computes (subtotal,shipping,totalweight) and total = subtotal+shipping 
after that it checks the balance if the total is bigger than the balance it prints "Insufficient Balance" else it continue the checkout and prints the receipt
