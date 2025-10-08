
class Person {
    String fullName;
    int personAge;

    Person(String fullName, int personAge) {
        this.fullName = fullName;
        this.personAge = personAge;
    }

    void displayPerson() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + personAge);
    }
}

class Student extends Person {
    String rollNo;

    Student(String fullName, int personAge, String rollNo) {
        super(fullName, personAge);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("\n--- Student Information ---");
        displayPerson();
        System.out.println("Roll Number: " + rollNo);
    }
}

public class SinglelevelinharitanceDemo {
    public static void main(String[] args) {
        Student stu = new Student("Roopesh Kumar", 20, "2305");
        stu.displayStudent();
    }
}