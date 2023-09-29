//Luke Jordan
package ST10258256;

import java.util.Scanner;

//child class to products 
public class Juice extends Products{

      String itemDescription;
      int itemPrice;
      int volume; //ml
      
      Scanner sc = new Scanner(System.in);
      
      
    public Juice(String itemDescription, int itemPrice, int volume){
        super(itemDescription, itemPrice);
        this.volume = volume;
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Method to get the volume of the drink
    public void volume(){
        System.out.println("What is the volume of the drink you are getting");
        setVolume(sc.nextInt());
    }
    

}
