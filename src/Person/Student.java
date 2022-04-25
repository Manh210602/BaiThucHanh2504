package Person;

public class Student extends Person {
    private String university;

    public Student(String name, int age, String address, String university) {
        super(name, age, address);
        this.university = university;
    }

    public Student(String university) {
        this.university = university;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
