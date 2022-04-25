package Person;

public class Customer extends Person {
    private String phoneNumber;

    public Customer(String name, int age, String address, String phoneNumber) {
        super(name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInformation() {
        return "Ten: " + getName() + ".\n Tuoi: " + getAge() + ".\n Dia chi: " + getAddress()
                + ".\n So Dien Thoai: " + getPhoneNumber() + ".\n Hang: Khach Thuong ";
    }
}
