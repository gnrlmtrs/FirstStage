import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final String lastName;
    private final String fatherName;
    private final String address;
    private final LocalDate birthdayDate;
    private final String phoneNumber;
    private final String facultyName;
    private final int courseId;
    private final int groupId;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getFacultyName(){
        return facultyName;
    }

    public int getCourseId(){
        return courseId;
    }

    public int getGroupId(){
        return groupId;
    }

    Student(int id, String name, String lastName, String fatherName, String address, LocalDate birthdayDate,
            String phoneNumber, String facultyName, int groupId, int courseId){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.address = address;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
        this.facultyName = facultyName;
        this.groupId = groupId;
        this.courseId = courseId;

    }


    Student(String lastName, String fatherName, String address, LocalDate birthdayDate,
            String phoneNumber, String facultyName, int groupId, int courseId){
        this.id = 1;
        this.name = "Maxim";
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.address = address;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
        this.facultyName = facultyName;
        this.groupId = groupId;
        this.courseId = courseId;

    }

    Student(int id, String name, String lastName, String fatherName, String address, LocalDate birthdayDate,
            String phoneNumber, String facultyName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.address = address;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
        this.facultyName = facultyName;
        this.groupId = 3;
        this.courseId = 3;
    }

    @Override
    public String toString(){
        return  "Id: " + id + "\nName: " + name + "\nLastname: " + lastName + "\nFathername: " +
                fatherName + "\nAddress: " + address + "\nBirthday date: " + birthdayDate +
                "\nGroup: " + groupId + "\nCourse: " + courseId + "\nFaculty name:" + facultyName +
                "\nPhone number: " + phoneNumber;
    }


    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student stud = (Student) obj;
            return id == stud.id &&
                    name.equals(stud.name) &&
                    lastName.equals(stud.lastName) &&
                    fatherName.equals(stud.lastName) &&
                    address.equals(stud.address) &&
                    birthdayDate.equals(stud.birthdayDate) &&
                    phoneNumber.equals(stud.phoneNumber) &&
                    facultyName.equals(stud.facultyName) &&
                    courseId == stud.courseId &&
                    groupId == stud.groupId;
        }
        return false;
    }




}
