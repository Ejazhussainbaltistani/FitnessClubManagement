import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Fitness {
	
	private String fitnessType,startDate,endDate;
    private static List<Booking> bookings;
    private static FitnessClass[] fitnessClasses;
    private static String [] feedbacks;

    public Fitness(FitnessClass [] fitnessClasses,String fitnessType) {
    	startDate="2023-04-10";
    	endDate="2023-06-18";
    	this.fitnessType=fitnessType;
        bookings = new ArrayList<>();
        this.fitnessClasses = fitnessClasses;
        feedbacks=new String[]{"very bad","bad","average","good","very good"};
    }
    
    public static FitnessClass getFitnessByShiftAndDay( String shift, DayOfWeek day) {
					for (FitnessClass fitnessClass : fitnessClasses) {
					    if (fitnessClass.getShift().equals(shift) && fitnessClass.getDay().equals(day)) {
					        return fitnessClass;
					    }
					}
        
        return null;
    }
    public static void showBookings()
    {
    	for(Booking b:bookings)
    	{
    		b.display();
    	}
    }
    
    public FitnessClass getFitnessClassByLesson(String name) {
       FitnessClass fitnessClass=null;
        	for(FitnessClass f:fitnessClasses)
        	{
        		if(f.getLesson().equals(name)) {
        			fitnessClass=f;
        		}
        	}
       
        
        return fitnessClass; // indicate that the class is not available on the specified date and shift
    }

    
    public int checkAvailableSeats(LocalDate date, String shift) {
        int count = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Booking booking : bookings) {
        	String id=booking.getClassId();
        	String shifts="";
        	for(FitnessClass f:fitnessClasses)
        	{
        		if(f.getClassId().equals(id)) {
        			shifts=f.getShift();
        			
        		}
        	}
            if (booking.getDate().equals(date) && shifts.equals(shift)) {
                count++;
            }
        }
        
        return 5-count; // indicate that the class is not available on the specified date and shift
    }
    

    public int checkAvailableSeats(LocalDate date, String shift) {
        int count = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Booking booking : bookings) {
        	String id=booking.getClassId();
        	String shifts="";
        	for(FitnessClass f:fitnessClasses)
        	{
        		if(f.getClassId().equals(id)) {
        			shifts=f.getShift();
        			
        		}
        	}
            if (booking.getDate().equals(date) && shifts.equals(shift)) {
                count++;
            }
        }
        
        return 5-count; // indicate that the class is not available on the specified date and shift
    }
    
    public void checkFeedbacks(LocalDate date, String shift) {
        int count = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Booking booking : bookings) {
        	String id=booking.getClassId();
        	String shifts="";
        	for(FitnessClass f:fitnessClasses)
        	{
        		if(f.getClassId().equals(id)) {
        			shifts=f.getShift();
        			
        		}
        	}
            if (booking.getDate().equals(date) && shifts.equals(shift)) {
              System.out.println(booking.getFeedback()+"\n");
            }
           
            
        }
        
        // indicate that the class is not available on the specified date and shift
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
