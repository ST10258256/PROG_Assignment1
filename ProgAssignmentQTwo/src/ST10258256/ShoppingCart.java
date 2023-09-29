//Luke Jordan
package ST10258256;

public class ShoppingCart {
    String itemName;
    int itemCost;
    static ShoppingCart[] sc = new ShoppingCart[100];
    int count = 0;
    
    //This will add the data, in this case food and drinks to the shoppingCart array
    public void addingToCart(int times, ShoppingCart[] me){
        sc[times] = me[times];
    }
    

    public ShoppingCart(){
        
    }

    ShoppingCart(String itemName, int itemCost){
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }
       //this will loop through the array adding all the prices of the products 
       //making a total price of all your goods
    public int totalItemCost(){
        int totalCost = 0;
        for (ShoppingCart s : sc){
            if (s != null) {
               totalCost = totalCost + s.getItemCost();
            }
        }
        return totalCost;
    }
    
    //This will loop through the array displaying each items name =, and cost
    public void displayAllitems(){
        for (ShoppingCart s : sc) {
            if (s != null) {
                System.out.println("Item name: " + s.getItemName());
                System.out.println("Item price: R" + s.getItemCost());
                System.out.println();
            }
        }
    }
    

}
