public class Student implements Prototype{
    private int rollno;
    private String name;
    private String college;

    Student(int roll,String name,String clg){
        this.name = name;
        this.rollno = roll;
        this.college = clg;
    }

    @Override
    public Prototype clone() {
        return new Student(this.rollno, this.name, this.college);
    }

    @Override
    public String toString() {
        return "Student{rollno=" + rollno + ", name='" + name + "', college='" + college + "'}";
    }
}
