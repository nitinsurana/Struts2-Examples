package model;

public class Phone {

    private String phoneType;
    private String phoneNumber;

    public Phone() {
    }

    public Phone(String phoneType, String phoneNumber) {

        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {

        String tempStr = "\nPhone type: " + getPhoneType() + "\t";

        tempStr = tempStr + "Phone number: " + getPhoneNumber();

        return tempStr;


    }
}
