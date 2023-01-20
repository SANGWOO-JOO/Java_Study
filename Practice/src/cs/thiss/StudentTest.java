package cs.thiss;

class Student {

    private int studentID; //학번
    private String studentName; //학생 이름

    public void setStudentID(int studentID) {
        this.studentID = studentID;
        System.out.println(this.studentID);
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println(this.studentName);
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Student studentPark = new Student();

        studentPark.setStudentID(17);
        studentPark.setStudentName("스티브");

    }
}
