class Solution 
{
    public int countTime(String time) 
    {
        int possibilities = 1;

        for(int i = 0; i < time.length(); i++)
        {
            if(time.charAt(i) == '?')
            {
                switch(i)
                {
                    case 0:
                        if (time.charAt(1) == '?') {
                            possibilities *= 24; // If both are '?', there are 24 possibilities for valid hours (00 to 23)
                        } else if (time.charAt(1) >= '4' && time.charAt(1) <= '9') {
                            possibilities *= 2; // If second digit is 4-9, first digit can only be 0 or 1
                        } else {
                            possibilities *= 3; // If second digit is 0-3, first digit can be 0, 1, or 2
                        }
                        break;

                    case 1:
                        if (time.charAt(0) != '2' && time.charAt(0) != '?') {
                            possibilities *= 10; // If first digit is 0 or 1, second digit can be 0-9
                        } else if (time.charAt(0) == '2') {
                            possibilities *= 4; // If first digit is 2, second digit can be 0-3
                        }
                        // If first digit is '?', this case was already handled in case 0
                        break;

                    case 3:
                        possibilities *= 6; // Third digit can be 0-5
                        break;

                    case 4:
                        possibilities *= 10; // Fourth digit can be 0-9
                        break;

                    default:
                        // Ignore other characters such as colons
                        break;
                }
            }
        }

        return possibilities;
    }
}
