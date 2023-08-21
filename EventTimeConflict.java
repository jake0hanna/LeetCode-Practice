import java.time.LocalTime;

class Solution 
{
    public boolean haveConflict(String[] event1, String[] event2) 
    {

        LocalTime startTime1 = LocalTime.parse(event1[0]);
        LocalTime endTime1 = LocalTime.parse(event1[1]);
        LocalTime startTime2 = LocalTime.parse(event2[0]);
        LocalTime endTime2 = LocalTime.parse(event2[1]);

        return (startTime1.isBefore(endTime2) && startTime2.isBefore(endTime1) || (startTime2.equals(endTime1) || startTime1.equals(endTime2)));
        
        
    }
}