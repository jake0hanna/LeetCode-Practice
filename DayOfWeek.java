import java.time.*;

class Solution 
{
    public String dayOfTheWeek(int day, int month, int year) 
    {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int dayOfWeek = Year.of(year)
                            .atMonth(Month.of(month))
                            .atDay(day)
                            .getDayOfWeek()
                            .getValue() - 1;

        return days[dayOfWeek];

    }
}