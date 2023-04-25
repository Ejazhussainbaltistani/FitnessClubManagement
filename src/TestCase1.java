import junit.framework.TestCase;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestCase1 extends TestCase {
private Booking booking1;
private Booking booking2;
private FitnessClass[] fitnessClasses;
protected void setUp() throws Exception {
    super.setUp();
    Customer customer1 = new Customer("John Doe", "johndoe@example.com");
    Customer customer2 = new Customer("Jane Smith", "janesmith@example.com");
    fitnessClasses = new FitnessClass[4];
    fitnessClasses[0] = new FitnessClass("F001", "Yoga", "first", DayOfWeek.SUNDAY, 20.0f);
    fitnessClasses[1] = new FitnessClass("F002", "Pilates", "first", DayOfWeek.SATURDAY, 25.0f);
    fitnessClasses[2] = new FitnessClass("F003", "Zumba", "second", DayOfWeek.SUNDAY, 15.0f);
    fitnessClasses[3] = new FitnessClass("F004", "Spinning", "second", DayOfWeek.SATURDAY, 30.0f);
    booking1 = new Booking("F001", "B001", customer1, LocalDate.parse("2023-12-10"), "booked", "");
    booking2 = new Booking("F002", "B002", customer2, LocalDate.parse("2023-12-11"), "cancelled", "");
}

public void testGetClassId() {
    assertEquals("F001", booking1.getClassId());
    assertEquals("F002", booking2.getClassId());
}

public void testSetClassId() {
    booking1.setClassId("F002");
    booking2.setClassId("F003");
    assertEquals("F002", booking1.getClassId());
    assertEquals("F003", booking2.getClassId());
}

public void testGetBookingId() {
    assertEquals("B001", booking1.getBookingId());
    assertEquals("B002", booking2.getBookingId());
}

public void testSetBookingId() {
    booking1.setBookingId("B003");
    booking2.setBookingId("B004");
    assertEquals("B003", booking1.getBookingId());
    assertEquals("B004", booking2.getBookingId());
}

public void testGetCustomer() {
    assertEquals("John Doe", booking1.getCustomer().getName());
    assertEquals("johndoe@example.com", booking1.getCustomer().getEmail());
    assertEquals("Jane Smith", booking2.getCustomer().getName());
    assertEquals("janesmith@example.com", booking2.getCustomer().getEmail());
}

public void testSetCustomer() {
    Customer customer1 = new Customer("Alice Brown", "alicebrown@example.com");
    Customer customer2 = new Customer("Bob Green", "bobgreen@example.com");
    booking1.setCustomer(customer1);
    booking2.setCustomer(customer2);
    assertEquals("Alice Brown", booking1.getCustomer().getName());
    assertEquals("alicebrown@example.com", booking1.getCustomer().getEmail());
    assertEquals("Bob Green", booking2.getCustomer().getName());
    assertEquals("bobgreen@example.com", booking2.getCustomer().getEmail());
}

public void testGetFitnessClass() {
    assertEquals("F001", booking1.getFitnessClass());
    assertEquals("F002", booking2.getFitnessClass());
}

public void testSetFitnessClass() {
    booking1.setFitnessClass("F002");
    booking2.setFitnessClass("F003");
    assertEquals("F002", booking1.getFitnessClass());
    assertEquals("F003", booking2.getFitnessClass());
}
}
