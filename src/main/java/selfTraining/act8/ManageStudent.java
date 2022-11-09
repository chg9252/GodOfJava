package selfTraining.act8;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = null;

        ManageStudent manageStudent = new ManageStudent();

        student = manageStudent.addStudent();

        manageStudent.printStudents(student);
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Kan");
        student[2] = new Student("Jung","seoul","01082290000","chg51@dkfj.com");
        return student;
    }

    public void printStudents(Student[] student){
        for (Student data : student) {
            System.out.println(data);
        }
    }


}
