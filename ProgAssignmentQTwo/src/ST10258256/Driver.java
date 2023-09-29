//Luke Jordan
package ST10258256;

import java.util.Scanner;

public class Driver {
    static Scanner kb = new Scanner(System.in);
    static ShoppingCart[] cart = new ShoppingCart[100];
    

    
    public static void main(String[] args) {
        System.out.println("This is a program so that you can keep track of your shopping");
        boolean con = true;
        String name = "";
        int price = 0;
        int choice = 0;
        int count = -1;
        while(con){
            count++;
            System.out.println("would you like to add an item to the cart. "
                    + "\n'yes' to carry on shopping\t'no' to check out");
            if (kb.next().equalsIgnoreCase("yes")) {
                System.out.println("Will you be adding a item of food(1) or an item of drinks(2)");
                choice = kb.nextInt();
                switch(choice){
                    case 1: System.out.println("Enter in the item description");
                            name = kb.next();
                            System.out.println("Enter in the item price");
                            price = kb.nextInt();
                            Food food = new Food("", 0, "");
                            food.defineFoodType();
                            ShoppingCart sCFood = new ShoppingCart(name, price);
                            cart[count] = sCFood;
                            sCFood.addingToCart(count, cart);                            
                            break;
                            
                    case 2: System.out.println("Enter in the item description");
                        name = kb.next();
                        System.out.println("Enter in the item price");
                        price = kb.nextInt();
                        Juice drinks = new Juice(name, price, 0);
                        drinks.volume();
                        ShoppingCart sCDrink = new ShoppingCart(drinks.getItemDescription(), drinks.getItemPrice());
                        cart[count] = sCDrink;
                        sCDrink.addingToCart(count, cart);
                        break;
                }
                
            }else{
                con = false;
            }
            }
                
                while(con == false){
                System.out.println("Would you like to view all your items in the cart(1),"
                        + " you can also see the total price(2), enter the number to see or (3) to exit");
                choice = kb.nextInt();
                ShoppingCart shop = new ShoppingCart();
                switch(choice){
                    case 1: shop.displayAllitems(); break;
                    case 2: System.out.println("The total cost of all items is : " +
                            shop.totalItemCost()); break;
                    case 3: System.exit(0);
       
        }
        
                }
    }//end of main
}//end of class
