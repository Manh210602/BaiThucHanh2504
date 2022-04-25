package Person;

public class OnlineStudent extends Student {
   private String platform;
   private String ID;

    public OnlineStudent(String name, int age, String address, String university, String platform, String ID) {
        super(name, age, address, university);
        this.platform = platform;
        this.ID = ID;
    }

    public OnlineStudent(String university, String platform, String ID) {
        super(university);
        this.platform = platform;
        this.ID = ID;
    }

    public OnlineStudent(String platform, String ID) {
        this.platform = platform;
        this.ID = ID;
    }

    public OnlineStudent() {
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
