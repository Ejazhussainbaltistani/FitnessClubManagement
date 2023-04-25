import java.time.DayOfWeek;
import java.util.Date;

public class FitnessClass {
	private String classId;
   private String lessonType;
   private String shift;
   private DayOfWeek day; 
   private float fee; 
   
   public FitnessClass(String classId ,String lessonType, String shift, DayOfWeek day,float fee) {
	   this.classId = classId;
      this.lessonType = lessonType;
      this.shift = shift;
      this.fee=fee;
      this.day = day;
   }
   
   public void display() {
	    System.out.println("Class ID: " + this.classId);
	    System.out.println("Lesson Type: " + this.lessonType);
	    System.out.println("Shift: " + this.shift);
	    System.out.println("Day: " + this.day);
	    System.out.println("Fee: " + this.fee);
	}
   
   public String getLesson() {
      return lessonType;
   }
   
   public String getClassId() {
	      return lessonType;
	   }
   public float getFee() {
	      return fee;
	   }
   
   public void setLesson(String lesson) {
      this.lessonType = lesson;
   }
   
   public String getShift() {
      return shift;
   }
   
   public void setShift(String shift) {
      this.shift = shift;
   }
   
   public DayOfWeek getDay() {
      return day;
   }
   
   public void setDay(DayOfWeek day) {
      this.day = day;
   }
}
