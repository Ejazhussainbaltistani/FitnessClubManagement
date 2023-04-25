import java.time.DayOfWeek;
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
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
