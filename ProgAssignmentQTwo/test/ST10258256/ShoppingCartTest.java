//Luke Jordan
package ST10258256;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {
    
    public ShoppingCartTest() {
    }

    @Test
    public void testTotalItemCost() {
        ShoppingCart[] sc = new ShoppingCart[2];
        ShoppingCart cart = new ShoppingCart("product 1", 12);   
        sc[0] = cart;
        cart = new ShoppingCart("product 2", 13);
        sc[1] = cart;
        
        int cost = cart.totalItemCost();
        for (ShoppingCart s : sc) {
            if (s != null) {
                cost = cost + s.getItemCost();
            }
        }
        assertEquals(cost, 25);
        
    }
    
    @Test
    public void testDisplayAllItems(){
        ShoppingCart cart = new ShoppingCart("product 1", 12);
        ShoppingCart[] sc = new ShoppingCart[1];
        sc[0] =  cart;
        
        assertEquals(cart.getItemName(), "product 1");
        assertEquals(cart.getItemCost(), 12);
    }
    
}
