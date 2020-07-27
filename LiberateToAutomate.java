
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class LiberateToAutomate {

  // all of our Java programs will have a "main method"
  // this is the ENTRY POINT of our program
  // the keywords prior to main:
  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static void main(String[] args) {
    //Scanner Creation
    Scanner user_input = new Scanner(System.in);
    //Lable and space
    System.out.println("Student Log\n\n");
    //first name
    System.out.println("Enter Student First Name");
    String firstName = user_input.nextLine();
    //last name
    System.out.println("Enter Student Last Name");
    String lastName = user_input.nextLine();
    //Major
    System.out.println("Enter " + firstName + " " + lastName + "'s Major");
    String studentMajor = user_input.nextLine();
    //Minor
    System.out.println("Enter " + firstName + " " + lastName + "'s Minor");
    String studentMinor = user_input.nextLine();
    //student age
    System.out.println("Enter Student Age");
    int age = user_input.nextInt();
    //expectedGraduationYear
    System.out.println(firstName +  " " + lastName + "'s Expected Graduation Year");
    int expectedGraduationYear = user_input.nextInt();
    //GPA
    System.out.println("Enter GPA of " + lastName + ", " + firstName);
    double gpa = user_input.nextDouble();
    //spacing
    System.out.println("\n\n");
    //print check
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Age: " + age);
    System.out.println("Major: " + studentMajor);
    System.out.println("Minor: " + studentMinor);
    System.out.println("Expected Graduation Year " + expectedGraduationYear);
    System.out.println("GPA: " + gpa);
    //space and end confirmation
    System.out.println("\n\nStudent Updated");
  }
}
