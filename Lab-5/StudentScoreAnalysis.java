import java.util.Arrays;

class Student {
    String studentID;
    String studentName;
    double[] scores;
    String[] skills;
    int skillCount;

    final static int NUMBER_OF_SUBJECTS = 5;
    final static int MAX_SKILLS = 10;

    public Student(String id, String name) {
        studentID = id;
        studentName = name;
        scores = new double[NUMBER_OF_SUBJECTS];
        skills = new String[MAX_SKILLS];
        skillCount = 0;
    }

    public Student(String id, String name, double[] scores) {
        studentID = id;
        studentName = name;
        this.scores = new double[NUMBER_OF_SUBJECTS];
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            this.scores[i] = scores[i];
        }
        skills = new String[MAX_SKILLS];
        skillCount = 0;
    }

    public void initializeScores(double[] scores) {
        for (int i = 0; i < NUMBER_OF_SUBJECTS; i++) {
            this.scores[i] = scores[i];
        }
    }

    public void addSkill(String skill) {
        if (skillCount < MAX_SKILLS) {
            skills[skillCount] = skill;
            skillCount++;
        } else {
            System.out.println("No space to add more skills!");
        }
    }

    public void printSkills() {
        String[] copy = new String[skillCount];
        for (int i = 0; i < skillCount; i++) {
            copy[i] = skills[i];
        }
        Arrays.sort(copy);
        System.out.println("Skills of " + studentName + ": " + Arrays.toString(copy));
    }

    public boolean isHavingSkill(String skill) {
        for (int i = 0; i < skillCount; i++) {
            if (skills[i].equalsIgnoreCase(skill)) {
                return true;
            }
        }
        return false;
    }

    public void removeSkill(String skill) {
        for (int i = 0; i < skillCount; i++) {
            if (skills[i].equalsIgnoreCase(skill)) {
                skills[i] = skills[skillCount - 1]; // replace with last skill
                skills[skillCount - 1] = null;
                skillCount--;
                System.out.println("Removed skill: " + skill);
                return;
            }
        }
        System.out.println("Skill not found: " + skill);
    }

    public String toString() {
        return "ID: " + studentID + "\nName: " + studentName +
                "\nScores: " + Arrays.toString(scores);
    }
}

public class StudentScoreAnalysis {
    public static void main(String[] args) {
        double[] marks = {85, 90, 78, 88, 92};

        Student s1 = new Student("2305", "Roopesh", marks);

        s1.addSkill("Java");
        s1.addSkill("Python");
        s1.addSkill("Communication");

        System.out.println(s1);

        s1.printSkills();

        System.out.println("Has Python? " + s1.isHavingSkill("Python"));
        System.out.println("Has C++? " + s1.isHavingSkill("C++"));

        s1.removeSkill("Python");
        s1.printSkills();
    }
}
