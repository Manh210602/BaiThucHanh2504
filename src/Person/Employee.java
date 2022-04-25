package Person;

public class Employee extends Person {
    private String workPlace;

    public Employee(String name, int age, String address, String workPlace) {
        super(name, age, address);
        this.workPlace = workPlace;
    }

    public Employee(String workPlace) {
        this.workPlace = workPlace;
    }

    public Employee() {
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }
}
