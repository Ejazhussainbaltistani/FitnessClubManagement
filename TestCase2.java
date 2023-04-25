import java.time.DayOfWeek;
import java.time.LocalDate;

import junit.framework.TestCase;

public class TestCase2 extends TestCase {

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

    public void testGetFitnessClassByLesson() {
    	Fitness fitness = new Fitness(fitnessClasses, "Gym");
    	FitnessClass result = fitness.getFitnessClassByLesson("Pilates");
    	assertNotNull(result);
    	assertEquals("F002", result.getClassId());
    	assertEquals("first", result.getShift());
    	}

    	public void TestGetClassByLessson() {
    	Fitness fitness = new Fitness(fitnessClasses, "Gym");
    	LocalDate date = LocalDate.parse("2023-12-10");
    	FitnessClass result = fitness.getFitnessClassByLesson("Yoga");
    	assertEquals(fitnessClasses[0], result); // assume no bookings have been made for Yoga class on 2023-12-10 first shift
    	}

    	public void TestGetIndex() {
        	Fitness fitness = new Fitness(fitnessClasses, "Gym");
        	LocalDate date = LocalDate.parse("2023-12-10");
        	int result = fitness.getIndex("");
        	assertEquals(-1, result); // assume no bookings have been made for Yoga class on 2023-12-10 first shift
        	}
    

}
