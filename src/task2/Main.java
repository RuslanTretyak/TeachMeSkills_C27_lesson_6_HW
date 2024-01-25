package task2;

import task2.student.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Астапчик", "Артём", "KH1234501"),
                new Student("Илькевич", "Алина", "KH1234502"),
                new Student("Иргалиева", "Анастасия", "KH1234503"),
                new Student("Каральчук", "Артем", "KH1234504"),
                new Student("Крайко", "Никита", "KH1234505"),
                new Student("Манеев", "Олег", "KH1234506"),
                new Student("Михновецкий", "Иван", "KH1234507"),
                new Student("Паляница", "Кирилл", "KH1234508"),
                new Student("Рябухин", "Руслан", "KH1234509"),
                        new Student("Саркисов", "Евгений", "KH1234510"),
                        new Student("Свинко", "Павел", "KH1234511"),
                        new Student("Семенчик", "Руслан", "KH1234512"),
                        new Student("Третяк", "Руслан", "KH1234513"),
                        new Student("Хамицкий", "Александр", "KH1234514"),
                        new Student("Чаботько", "Даниил", "KH1234515"),
                        new Student("Шубин", "Алексей", "KH1234516"),
                        new Student("Колос", "Владислав", "KH1234517"),
        };
        for (Student student : students) {
            student.printInfo();
        }
    }
}
