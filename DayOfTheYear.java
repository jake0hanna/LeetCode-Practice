import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution 
{//1154
    public int dayOfYear(String date) 
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);

        return localDate.getDayOfYear();



    }

}