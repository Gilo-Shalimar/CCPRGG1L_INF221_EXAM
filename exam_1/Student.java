public class Student {
    String surname;
String firstName;
char middleInitial;
int dateOfBirth;
int studentNumber;
String studentEmailAddress;
boolean iAmAwesome;

public void sayMyStudentNumber() {
    System.out.println("Student Number " + studentNumber );
}
public void sayMyEmailAddress() {
    System.out.println("Student Email Address" + studentEmailAddress );
}
public void amIAwesome() {
    System.out.println("am I AWSOME?!" + iAmAwesome);
}
    
}