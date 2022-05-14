package day09;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Tom");
        Student student = new Student("Jack", "Biolog");
        Teacher teacher = new Teacher("Ron", "Drochillla");

        System.out.println(student.getNameGroup());
        System.out.println(teacher.getLesson());

        human.printInfo();
        student.printInfo();
        teacher.printInfo();

    }
}
