//Luke Jordan
package ST10258256;

import static ST10258256.Student.kb;
import java.util.Scanner;

public class Driver {
    private static boolean con = true;
    private static Scanner kb = new Scanner(System.in);
    static Student stu = new Student();
    static int count = 0;
    
    public static void main(String[] args) {
        
        int input;
        //The while loop will keep going as long as the user wants to.
        while(con){
            //This is the menu of the program, where the user will make descions 
            System.out.println("Student Management Application\n"
                    + "*****************************************");
            System.out.println("Please select one of the follwoing menu items:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit application");
            
            //will capture the users input
            input = kb.nextInt();
            
            //A switch statement to run whatever the user inputted
            switch(input){
                case 1: stu.saveStudent(count); 
                        count ++;
                        break;// SaveStudent
                        
                case 2: System.out.println("Input the id you are searching for");
                        stu.searchStudent(kb.next());break;//search for student
                        
                case 3: System.out.println("Input the id youare searching for");
                        stu.deleteStudent(kb.next());break; //Delete a stuedent
                        
                case 4: stu.viewStudentReport();
                        break; //PrintStudent report
                case 5: System.exit(0); break; //Exit the system
                
                default: System.out.println("You have entered an incorrect"
                        + " number. Please try again."); break; //Dealut response 
                
            }
        }
    }//End of main
    
}//End of class
