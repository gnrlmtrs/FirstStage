import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        Student student1 = new Student(1, "Maxim", "Pernach", "Vadimovich",
                    "Minsk, Sverdlova 13", LocalDate.of(2000, 12, 30),
                    "+375297265604", "FIT", 3, 3);
        Student student2 = new Student(2, "Dmitriy", "Alexeev", "Alexeevich",
                    "Minsk, Belorysskaya, 13", LocalDate.of(2001, 8, 25),
                    "+3752911111111", "PIM", 2, 3);
        Student student3 = new Student(3, "Vasily", "Alexeev", "Alexeevich",
                "Minsk, Belorysskaya, 13", LocalDate.of(2002, 4, 25),
                "+3752911111111", "FIT", 3, 2);
        Student student4 = new Student(4, "Alexey", "Fedorov", "Fedorovich",
                "Minsk, Belorysskaya, 13", LocalDate.of(2001, 1, 18),
                "+375291111334", "FIT", 3, 3);
        Student student5 = new Student(5, "Nick", "Nick", "Nick",
                "Minsk, Belorysskaya, 13", LocalDate.of(2001, 5, 20),
                "+375291111334", "LMA", 3, 3);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        StudentsArray studentsArray = new StudentsArray(studentArrayList);

        studentsArray.printAllStudents();

        String facultyName = "FIT";
        studentsArray.getStudentByFaculty(facultyName);
        System.out.println("\n");

        for(int i = 0; i < studentsArray.size(); i++){
            System.out.println("Name of student: " + studentsArray.getListOfStudentByFacultyAndCourse().get(i).getName() +
                    " Faculty of this students:" + studentsArray.getListOfStudentByFacultyAndCourse().get(i).getFacultyName()
            + " Group: " + studentsArray.getListOfStudentByFacultyAndCourse().get(i).getGroupId());
        }
        System.out.println("\n");

        int courseId = 3;
        int groupId = 3;
        studentsArray.getListOfStudentsByGroup(facultyName, groupId, courseId);

        System.out.println("\n");
        
        studentsArray.getStudentWhosBirthdayAfterParametrizedDate(LocalDate.of(2001, 3, 3));

    }
}
