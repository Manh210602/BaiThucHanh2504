package Person;

public class VIPCustomer extends Person { private String phoneNumber;


    public VIPCustomer(String name, int age, String address, String phoneNumber) {
        super(name, age, address);
        this.phoneNumber = phoneNumber;
    }

    public VIPCustomer(boolean isVIP, String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VIPCustomer() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInformation() {
        return "Ten: " + getName() + ".\nTuoi: " + getAge() + ".\nDia chi: " + getAddress()
                + ".\nSo Dien Thoai: " + getPhoneNumber() + ".\nHang: Khach VIP ";
    }
}
