public class App {
    public static void main(String[] args) {
      Student Me = new Student();
      Me.surname = "Gilo";
      Me.firstName = "Shalimar";
      Me.middleInitial = 'D';
      Me.dateOfBirth = 12/31/03;
      Me.studentNumber = 2022103688;
      Me.studentEmailAddress = "gilosd@students.national-u.edu,ph";
      Me.iAmAwesome = true;
      Me.sayMyStudentNumber();
      Me.sayMyEmailAddress();
      Me.amIAwesome();

    }
}
