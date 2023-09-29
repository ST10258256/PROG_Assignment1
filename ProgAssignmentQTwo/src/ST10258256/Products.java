//Luke Jordan
package ST10258256;

public class Products {
    
    int itemPrice;
    String itemDescription;
    //This is the parent class
    public Products(String itemDescription, int itemPrice){
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
