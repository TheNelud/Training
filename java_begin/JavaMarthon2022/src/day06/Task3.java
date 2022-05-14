package day06;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Петров");
        Teacher teacher = new Teacher("Залупенский", "Мозгоебенье");

        teacher.evaluate(student);

    }
}
