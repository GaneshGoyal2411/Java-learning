/*import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Date{
    public static void main(String[] args) {
        // LocalDate myObj = LocalDate.now();
        // LocalTime myObj2 = LocalTime.now();
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);
    }
}*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Date{
    public static void main(String args[]){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting - "+myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After format - "+formattedDate);
    }
}