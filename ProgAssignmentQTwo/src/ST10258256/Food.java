//Luke Jordan
package ST10258256;

import static ST10258256.Driver.kb;
import java.util.Scanner;

//Is a child class to products 
public class Food extends Products{
    String foodType;
    Scanner sc = new Scanner(System.in);
    
    public Food(String itemDescription, int itemPrice, String foodType){
        super(itemDescription, itemPrice);
        this.foodType = foodType;
    }
    

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    
    //This is where you can define more with how your food is
    public void defineFoodType(){
        System.out.println("What type of food did you choose\n(1) meat, (2) vegetable, (3) fruit");
         int choice = sc.nextInt();       
        switch(choice){
            case 1: System.out.println("What type of meat did you get");
                    setFoodType(sc.next()); break;
            case 2: System.out.println("What type of vegetable did you get");
                    setFoodType(sc.next()); break;
            case 3: System.out.println("What type of fruit did you get");
                    setFoodType(sc.next()); break;
            default : System.out.println("You have inputted an incorrect value");                          
        }
        
    }
    
}
