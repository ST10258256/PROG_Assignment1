//Luke Jordan
package ST10258256;

import static ST10258256.Driver.count;
import java.util.Scanner;

public class Student {

    private String StuID;
    private String StuName;
    private int StuAge;
    private String StuEmail;
    private String StuCourse;
    
    static Scanner kb = new Scanner(System.in);
    Student[] s = new Student[100];
    int count = 0;
    
   // private static int count = 1;
    
    public Student(){
        
    }
    //constructor for the Student class
    public Student(String ID, String name, int age, String email, String course){
        this.StuID = ID;
        this.StuName = name;
        this.StuAge = age;
        this.StuEmail = email;
        this.StuCourse = course;
    }

    public String getStuID() {
        return StuID;
    }

    public void setStuID(String StuID) {
        this.StuID = StuID;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public int getStuAge() {
        return StuAge;
    }

    public void setStuAge(int StuAge) {
        this.StuAge = StuAge;
    }

    public String getStuEmail() {
        return StuEmail;
    }

    public void setStuEmail(String StuEmail) {
        this.StuEmail = StuEmail;
    }

    public String getStuCourse() {
        return StuCourse;
    }

    public void setStuCourse(String StuCourse) {
        this.StuCourse = StuCourse;
    }
  
    //Method intended to save data for a new student and put into the array
    public void saveStudent(int c){
        
        //getting the users information
        System.out.println("Enter the Student ID: ");
        setStuID(kb.next());
        System.out.println("Enter the Student name: ");
        setStuName(kb.next());
        System.out.println("Enter the Student age: ");
        setStuAge(kb.nextInt());
        System.out.println("Enter the Student email: ");
        setStuEmail(kb.next());
        System.out.println("Enter the Student course");
        setStuCourse(kb.next());
        
        //to check if the users age is valid
        while(checkAge(getStuAge()) == true || checkCh(getStuAge() + "") == false){
            System.out.println("You have input and incorrect age, student has to be "
                    + "16 years or older, or you might of not put in a number"
                    + "\nPlease enter in your age again");
            setStuAge(kb.nextInt()); 
        }
        
        //will add this data to the array
        Student stu = new Student(getStuID(), getStuName(), getStuAge(), getStuEmail(), getStuCourse());
        s[count] = stu;
        this.count++;
               
        
       // count ++;
        
        
    }
    
    //Method to check the age of the user, revolving around
    public boolean checkAge(int age){
        if(age < 16) {
            return true;
        }else
            return false;
        
    }
    
    //Method to check that the user did input a number and not a character
    public boolean checkCh(String age){
        String str = age + "";
        if (str.contains("0") || str.contains("1") || str.contains("2") || str.contains("3")
               || str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7")
                     || str.contains("8") || str.contains("9")) {
            return true;
        }else{
            return false;
        }
        
    }
    
    //Method to search the array for a id 
    public void searchStudent(String id){
        boolean con = true;
        int i = 0;
        while(con == true){
            //will loop through the array
            for (Student me : s) {
                //as long as the array is not null
                if (me != null) {
                    //if the id gets a match it will print out the details
                  if (me.getStuID().equals(id) ) {
                System.out.println("Student ID: " + me.getStuID());
                System.out.println("Student Name: " + me.getStuName());
                System.out.println("Student Age: " + me.getStuAge());
                System.out.println("Student Email: " + me.getStuEmail());
                System.out.println("Student Course: " + me.getStuCourse());
            }
                  //wiil alert the user that it was not able to find that id
                System.out.println("Student with student ID: " + id + " was not "
                        + "found. Enter 'XXX' if you want to go back to the menu");
                id = kb.nextLine();
                if (id.equals("XXX")) {
                    con = false;
                }
            }
                
            }
                    
        }
    }
    
    //This method will remove all the information on a user 
    public void deleteStudent(String id){
       
        boolean con = true;
        String y = "";
        int trace = 0;
        int index = s.length;
        //It wiil try to match the id with the ids found in the array
        while(con == true){
        for (Student me : s) {
            if (me != null) {
                trace ++;
                //Once matched with one it will ask the user if the are sure about it
                if (me.getStuID().equals(id)) {
                System.out.println("Are you sure that you want to delete student " + id
                + " Enter 'yes' if you want to continue. Enter 'no' if you changed your mind");
                index = trace;
                
                //If they do say yes then it will replace it with the values of
                //the one ahead of it in the array 
                //And then so on with the next one
                    if (kb.nextLine().equalsIgnoreCase("yes")) {
                    for (int i = index; i < s.length; i++) {
                    s[index - 1] = s[i];
                }
                        System.out.println("The student has been deleted");
                        con = false;
                    }
            }else{
                System.out.println("Student with student ID: " + id + " was not "
                        + "found. Enter 'XXX' if you want to go back to the menu");
                id = kb.nextLine();
                if (id.equals("XXX")) {
                    con = false;
                }
                }
            }
            

        }
        }

        
  
    }
    
    //thismethod is supppose to print out all of the students data
    public void viewStudentReport(){
        int c = 0;
        for (Student me : s) {
            if(me != null){
            System.out.println("Student " + c + 1 + ""
                    + "\n***********************************\n");
            System.out.println("Student ID: " + s[c].getStuID());
            System.out.println("Student Name: " + s[c].getStuName());
            System.out.println("Student Age: " + s[c].getStuAge());
            System.out.println("Student Email: " + s[c].getStuEmail());
            System.out.println("Student Course: " + s[c].getStuCourse());
            c++;
            }

        }
        
    }
    
    
}
