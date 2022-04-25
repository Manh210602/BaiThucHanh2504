package Person;

public class FulltimeEmployee extends Employee {
    private String position;

    public FulltimeEmployee(String name, int age, String address, String workPlace, String position) {
        super(name, age, address, workPlace);
        this.position = position;
    }

    public FulltimeEmployee(String position) {
        this.position = position;
    }

    public FulltimeEmployee() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
