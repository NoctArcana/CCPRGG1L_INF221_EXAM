public class Student {
    String Surname;
    String FirstName;
    String MiddleInitial;
    int DateOfBirth;
    int StudentNumber;
    String StudentEmailAddress;
    Boolean IAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println("My student number is " + StudentNumber);

    }

    public void sayMyEmailAddress() {
        System.out.println("My email address is " + StudentEmailAddress);

    }
    
    public void amIAwesome() {
        System.out.println("It is " + IAmAwesome + " that I am awesome");

    }
}
