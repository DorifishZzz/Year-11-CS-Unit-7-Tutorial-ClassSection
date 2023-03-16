import java.util.*;
public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    ArrayList<Student> student;

    public ClassSection(String sub, int cap, int year){
        subject = sub;
        capacity = cap;
        yearLevel = year;
    }

    public String getSubject(){return subject;}
    public void setSubject(String sub){
        subject = sub;
    }
    public int getCapacity(){return capacity;}
    public void setCapacity(int cap){
        capacity = cap;
    }

    public int getYearLevel(){return yearLevel;}
    public void setYearLevel(int year){yearLevel = year;}
    public ArrayList getStudent(){return student;}
    public void addStudent(Student student){
        this.student.add(student);
    }

    public void removeStudent(Student student){
        this.student.remove(student);
    }

    public boolean isStudentEnrolled(Student student){
        boolean found = false;
        if(Collections.frequency(this.student,student)>=1){
            found = true;
        }
        return found;
    }
}