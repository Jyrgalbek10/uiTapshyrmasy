import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SvoiException {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Asan",18));
        students.add(new Student(null,21));
        students.add(new Student("Akul",-20));
        students.add(new Student("Peri",19));
        for (int i = 0; i < students.size(); i++) {
        }
        System.out.println(students);
    }
}
