import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
}