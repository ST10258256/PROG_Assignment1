//Luke Jordan
package ST10258256;

import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StudentTest {
    
    public StudentTest() {
    }

    @Test
    public void testSaveStudent() {
        Student stu = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        
        
        Scanner scn = new Scanner("10111\nJ.Bloggs\n19\njbloggs@ymail.com\ndisd");
        
        assertEquals("10111", stu.getStuID());
        assertEquals("J.Bloggs", stu.getStuName());
        assertEquals(19, stu.getStuAge());
        assertEquals("jbloggs@ymail.com", stu.getStuEmail());
        assertEquals("disd", stu.getStuCourse());
                
        
    }
    
    @Test
    public void testSearchStudent(){
    Student stu = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
    String str = "";
    
    Student[] stuArr = new Student[1];
    stuArr[0] = stu;
        for (Student s : stuArr) {
            
            if (s != null) {
            
                if (s.getStuID().equals("10111")) {
                    assertEquals("10111", s.getStuID());
                    assertEquals("J.Bloggs", s.getStuName());
                    assertEquals(19, s.getStuAge());
                    assertEquals("jbloggs@ymail.com", s.getStuEmail());
                    assertEquals("disd", s.getStuCourse());
            }
          }
        }   
        
        
}
    
    @Test
    public void testStudentAgeValid(){
       Student stu = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
       
       assertEquals(stu.checkAge(stu.getStuAge()), false);
       
    }
    
    @Test
    public void testStudentAgeInvalid(){
        Student stu = new Student("10110", "H.Potter", 15, "hpotter@ymail.com", "spellcraft");
        
        assertEquals(stu.checkAge(stu.getStuAge()), true);
    }
    
    @Test
    public void testStudentAgeInvalidCharacter() {
        Student stu = new Student("10109", "Fred", 123, "FredMail@mail", "fRed");

        assertEquals(stu.checkCh(stu.getStuAge() + ""), true);
    }
    
    @Test
    public void testSearchStudentNotFound(){
    Student stu = new Student("10112", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
    String str = "";
    boolean found = false;
    
    Student[] stuArr = new Student[1];
    stuArr[0] = stu;
        for (Student s : stuArr) {
            
            if (s != null) {
            
                if (s.getStuID().equals("10111")) {
                     found = true;
            }
          }
        }   
        
        assertFalse(found);
    }
    
    @Test
    public void testDeleteStudent(){
        Student stu = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
    String str = "";
    int count = 0;
    int ref = 0;
    Student[] stuArr = new Student[2];
    stuArr[0] = stu;
    boolean found = false;
    stu = new Student("10112", "H.Potter", 18, "H.Potter@ymail.com", "magic");
    stuArr[1] = stu;
    
        for (Student s : stuArr) {
            count++;
            if (s != null) {
            
                if (s.getStuID().equals("10111")) {
                    ref = count;
            }
          }
        } 
        
        for (int i = ref; i < stuArr.length; i++) {
            stuArr[i -1] = stuArr[i];
        }
        
            for (Student s : stuArr) {
            if (s != null) {
            
                if (s.getStuID().equals("10111")) {
                    found = true;
            }
          }
        }
            
            assertFalse(found);

    }
    
    @Test
    public void testDeleteStudentNotFOund(){
    Student stu = new Student("10112", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
    String str = "";
    boolean found = false;
    
    Student[] stuArr = new Student[1];
    stuArr[0] = stu;
        for (Student s : stuArr) {
            
            if (s != null) {
            
                if (s.getStuID().equals("10111")) {
                     found = true;
            }
          }
        }   
        
        assertFalse(found);
    }
}
