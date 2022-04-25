package Person;

public class PartimeEmployee extends Employee {
    private int hoursInADay;

    public PartimeEmployee(String name, int age, String address, String workPlace, int hoursInADay) {
        super(name, age, address, workPlace);
        this.hoursInADay = hoursInADay;
    }

    public PartimeEmployee(String workPlace, int hoursInADay) {
        super(workPlace);
        this.hoursInADay = hoursInADay;
    }

    public PartimeEmployee(int hoursInADay) {
        this.hoursInADay = hoursInADay;
    }

    public PartimeEmployee() {
    }

    public int getHoursInADay() {
        return hoursInADay;
    }

    public void setHoursInADay(int hoursInADay) {
        this.hoursInADay = hoursInADay;
    }
}
