package Arrays;
import java.time.LocalDate;

public class CurrentDayOfYearExample {

    public static void main(String[] args) {
    	
    	
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = null;
        int currentMonthValue = endDate.getMonthValue();
        if(currentMonthValue%3==0) {
        	startDate=endDate.minusMonths(5);	
        }else if(currentMonthValue%3==1) {
        	startDate=endDate.minusMonths(3);	
        }else if(currentMonthValue%3==2) {
        	startDate=endDate.minusMonths(4);	
        }
        startDate=startDate.withDayOfMonth(1);
		System.out.println("endDate: " + endDate);
        System.out.println("StartDate: " + startDate);
  
    }
}
