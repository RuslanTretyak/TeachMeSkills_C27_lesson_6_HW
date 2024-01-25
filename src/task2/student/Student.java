package task2.student;

public class Student {
    public String surname;
    public String name;
    public String passNumber;
    public String group = "C27-onl";

    public Student(String surname, String name, String passNumber) {
        this.surname = surname;
        this.name = name;
        this.passNumber = passNumber;
    }

    public void printInfo() {
        System.out.println("\n" + this.surname + " " + this.name + "\n" + this.passNumber + "\nгруппа " + this.group);
    }
}
