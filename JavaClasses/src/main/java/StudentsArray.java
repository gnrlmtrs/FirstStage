import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsArray {
    private ArrayList<Student> students;

    public StudentsArray(){
        students = new ArrayList<Student>();
    }

    public StudentsArray(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList<Student> getStudents(){
        return new ArrayList<>(students);
    }

    public void addingStudents(Student student){
        students.add(student);
    }

    public void removingStudents(Student student){
        students.remove(student);
    }

    public void printAllStudents(){
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }


    public void getStudentByFaculty(String facultyName){
        List<Student> studList = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFacultyName().equals(facultyName)) {
                studList.add(students.get(i));
            }
        }
        for(int i = 0; i < studList.size(); i++){
            System.out.println("Student ID: " + studList.get(i).getId()  + " Its faculty: " + facultyName);
        }

    }




    public List<Student> getListOfStudentByFacultyAndCourse(){
        for(int i = 0; i < students.size(); i++){
            students.sort(Comparator.comparing(Student::getGroupId));
            students.sort(Comparator.comparing(Student::getFacultyName));
            return students;
        }
        return null;
    }


    public void getListOfStudentsByGroup(String facultyName, int groupId, int courseId){
        List<Student> studList = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFacultyName().equals(facultyName) &&
                    students.get(i).getGroupId() == groupId &&
                    students.get(i).getCourseId() == courseId)
               studList.add(students.get(i));
        }
        for(int i = 0; i < studList.size(); i++){
            System.out.println("Student's ID " + studList.get(i).getId() + " Student's faculty: " + facultyName +
                    " Student's group: " + groupId + " Student's course: " + courseId);
        }
    }

    public void getStudentWhosBirthdayAfterParametrizedDate(LocalDate date){
        List<Student> studList = new ArrayList<Student>();
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getBirthdayDate().isAfter(date)){
                studList.add(students.get(i));
            }
        }

        for(int i = 0; i < studList.size(); i++){
            System.out.println("Students ID:" + studList.get(i).getId() + " Parametirzed date: " + date +
                    " Student's birthday:" + studList.get(i).getBirthdayDate());
        }
    }

    public int size(){
        return students.size();
    }

}
