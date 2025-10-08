class Student {
    String name;
    String studentId;

    Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}

class DiplomaStudent extends Student {
    int year;
    String department;

    DiplomaStudent(String name, String studentId, int year, String department) {
        super(name, studentId);
        this.year = year;
        this.department = department;
    }

    void showDiplomaDetails() {
        System.out.println("\n--- Diploma Student ---");
        displayInfo();
        System.out.println("Year: " + year);
        System.out.println("Department: " + department);
    }
}

class PhDStudent extends Student {
    String field;
    String guideName;

    PhDStudent(String name, String studentId, String field, String guideName) {
        super(name, studentId);
        this.field = field;
        this.guideName = guideName;
    }

    void showPhDDetails() {
        System.out.println("\n--- PhD Student ---");
        displayInfo();
        System.out.println("Field of Study: " + field);
        System.out.println("Research Guide: " + guideName);
    }
}

public class HierarchiallinheritanceDemo {
    public static void main(String[] args) {
        DiplomaStudent d1 = new DiplomaStudent("Roopesh", "D2301", 2, "Cs");
        PhDStudent p1 = new PhDStudent("Rolex", "P1054", "Quantum Computing", "Dr. Mehta");

        d1.showDiplomaDetails();
        p1.showPhDDetails();
    }
}