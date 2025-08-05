public class Student extends Person{
    private int rollno;
    private char grade;

    public Student(){
        System.out.println("Non-Parameterized const. in Student Class");
    }
    public Student(int rollno,char grade){
        this.rollno =rollno;
        this.grade = grade;
    }

    public int getRollno() {
        return rollno;
    }

    public char getGrade() {
        return grade;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nName:"+getName()+"\nAge:"+getAge()+"\nRollno:"+getRollno()+"\nGrade:"+getGrade()+"\nAddress:"+getAddress());
    }
}
