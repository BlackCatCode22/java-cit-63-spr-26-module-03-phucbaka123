package mystudent;
import mystudent.Student;


public class App {
    public static void main(String [] args){
        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halper";
        myStudent.major = "Bussiness";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;


        Student myStudent2 = new Student();
        myStudent2.firstName = "Jen";
        myStudent2.lastName = "Pam";
        myStudent2.major = "Brown";
        myStudent2.gpa = 2.3;
        myStudent2.age = 24;
        myStudent2.onProbation = false;
        System.out.println(myStudent2.firstName);
    }
}
