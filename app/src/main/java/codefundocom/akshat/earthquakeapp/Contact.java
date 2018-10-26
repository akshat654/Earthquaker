package codefundocom.akshat.earthquakeapp;

/**
 * Created by Akshat on 26-10-2018.
 */

public class Contact {
    private String name ,number , status;

    public Contact() {
    }

    public Contact(String name, String number, String status) {
        this.name = name;
        this.number = number;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setYear(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
