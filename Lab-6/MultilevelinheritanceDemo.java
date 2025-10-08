class Person {
    String personName;
    int personAge;

    Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    void displayPerson() {
        System.out.println("Name: " + personName);
        System.out.println("Age: " + personAge);
    }
}

class Student extends Person {
    String regNumber;

    Student(String personName, int personAge, String regNumber) {
        super(personName, personAge);
        this.regNumber = regNumber;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Registration Number: " + regNumber);
    }
}

class GraduateStudent extends Student {
    String subject;

    GraduateStudent(String personName, int personAge, String regNumber, String subject) {
        super(personName, personAge, regNumber);
        this.subject = subject;
    }

    void displayGraduateStudent() {
        System.out.println("\n--- Graduate Student Details ---");
        displayStudent();
        System.out.println("Subject: " + subject);
    }
}

public class MultilevelinheritanceDemo {
    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent("Roopesh Kumar", 19, "REG2305", "Data Science");
        grad.displayGraduateStudent();
    }
}