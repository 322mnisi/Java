import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {
    public static void datevalidator(String birthdate) {

        if (birthdate.matches("\\d{2}/\\d{2}/\\d{4}")){
        

            String dayBorn = birthdate.split("/")[0];
            int day = Integer.parseInt(dayBorn);

            String monthBorn = birthdate.split("/")[1];
            int month = Integer.parseInt(monthBorn);

            String yearBorn = birthdate.split("/")[2];
            int year = Integer.parseInt(yearBorn);
            }
            else 
            {
            System.out.println("Date is not valid!!! Exiting");
            System.exit(0);
            }

    } 
}

 