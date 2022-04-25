package Person;

public class OfflineStudent extends Student {
    private String amphitheater;

    public OfflineStudent(String name, int age, String address, String university, String amphitheater) {
        super(name, age, address, university);
        this.amphitheater = amphitheater;
    }

    public OfflineStudent(String university, String amphitheater) {
        super(university);
        this.amphitheater = amphitheater;
    }

    public OfflineStudent(String amphitheater) {
        this.amphitheater = amphitheater;
    }

    public OfflineStudent() {
    }

    public String getAmphitheater() {
        return amphitheater;
    }

    public void setAmphitheater(String amphitheater) {
        this.amphitheater = amphitheater;
    }
}
