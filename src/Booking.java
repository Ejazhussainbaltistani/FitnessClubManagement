import java.time.LocalDate;
import java.util.Date;

public class Booking {
    private String bookingId;
    private Customer customer;
    private String classId;
    private LocalDate date;
    private String status;
    private String feedback;

    public Booking(String classId,String bookingId, Customer customer, LocalDate date, String status, String feedback) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.classId = classId;
        this.date = date;
        this.status = status;
        this.feedback = feedback;

    }
    
    public String getClassId() {
        return classId;
    }

    public void setClassId(String bookingId) {
        this.classId = bookingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFitnessClass() {
        return classId;
    }

    public void setFitnessClass(String classId) {
        this.classId = classId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public void display() {
        System.out.println("Date: " + this.date);
        System.out.println("Lesson Type: " + this.classId);
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Booking otherBooking = (Booking) obj;
        return this.bookingId.equals(otherBooking.bookingId);
    }
}
