import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;

public class StringsAndDates {
    // message to display: Hello {userName} today is {day of the week} have a good {period of the day}
    public static void main(String[] args){

        String user = "Lucas";
        LocalDate localDateNow = LocalDate.now();
        LocalDateTime localTimeNow = LocalDateTime.now();

        String dayOfTheWeek;
        String dayPeriod;

        Locale brasil = new Locale("pt", "BR");
        dayOfTheWeek = localDateNow.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        if (localTimeNow.getHour() > 0 && localTimeNow.getHour() < 12){
            dayPeriod = "Morning";
        }
        else if (localTimeNow.getHour() > 12 && localTimeNow.getHour() < 18){
            dayPeriod = "Afternoon";
        }
        else if (localTimeNow.getHour() > 18 && localTimeNow.getHour() < 24){
            dayPeriod = "Night";
        }

        else {
            dayPeriod = "Hello";
        }

        System.out.printf("Hello %s. today is %s. have a good %s.%n", user, dayOfTheWeek, dayPeriod);

    }
}
