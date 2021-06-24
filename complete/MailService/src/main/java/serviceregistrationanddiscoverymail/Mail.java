package serviceregistrationanddiscoverymail;

import java.util.Date;

public class Mail {

    private String from;
    private Date timestamp;
    private String message;
    private Address address;

    public Mail(String from, Date timestamp, String message, Address address) {
        this.from = from;
        this.timestamp = timestamp;
        this.message = message;
        this.address = address;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Mail{" +
                "from='" + from + '\'' +
                ", timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
