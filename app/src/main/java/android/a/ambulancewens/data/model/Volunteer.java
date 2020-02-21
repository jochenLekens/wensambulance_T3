package android.a.ambulancewens.data.model;

public class Volunteer {
    private String name;
    private String address;
    private String email;
    private String telephone;
    private String shirtSize;
    private String registerNumber;

    public Volunteer(String name, String address, String email, String telephone, String shirtSize, String registerNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.shirtSize = shirtSize;
        this.registerNumber = registerNumber;
    }

    public Volunteer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }
}
