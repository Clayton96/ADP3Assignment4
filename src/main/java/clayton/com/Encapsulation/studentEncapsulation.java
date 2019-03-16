package clayton.com.Encapsulation;

public class studentEncapsulation {

    private String studentNum = "12345";
    private String name = "Clayton";
    private String courseID = "ADP3";


    public studentEncapsulation(String studentNum, String name, String courseID) {

        this.studentNum = studentNum;
        this.name = name;
        this.courseID = courseID;

    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setAge(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String toString(){

        return "Student number: " + studentNum + "\n" + "Name: " + name
                + "\n" + "course id: " + courseID;

    }



}
