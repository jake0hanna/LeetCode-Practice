public class ScoreTracker
{
    public int calPoints(String[] operations) 
    {
        ArrayList<Integer> record = new ArrayList<Integer>();

        for (String s : operations) 
        {
                switch (s) 
                {
                    case "+":
                        record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
                        break;

                    case "C":
                        record.remove(record.size() - 1);
                        break;

                    case "D":
                        record.add(record.get(record.size() - 1) * 2);
                        break;

                    default :
                        record.add(Integer.valueOf(s));
                        break;
                }
            
        }

        int sum = 0;

        for(int nums : record) 
        {
            sum += nums;
        }

        return sum;
    }
}
