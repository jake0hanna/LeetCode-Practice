public class MaximumNumberOfBalloons 
{

        public int maxNumberOfBalloons(String text) 
        {
    
            HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
    
            char[] textChars = text.toCharArray(),
                   balloon = new char[]{'b','a','l','o','n'};
    
            int amount = text.length();
    
            for(char c : textChars)
            {
                characters.put(c, characters.getOrDefault(c, 0) + 1);
    
            }
            
            for(char c : balloon)
            {
                if (characters.get(c) != null) 
                {
                    int count = characters.get(c);
                    if (c == 'l' || c == 'o') 
                    {
                        count /= 2;
                    }
                    amount = Math.min(amount, count);
                } 
                else
                {
                    return 0;
                }
    
            }
    
            return amount;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
            /* this sucked for so many reasons
    
            String toFind = "balloon";
            int tracker = 0;
            int howMany = 0;
            boolean stillLooking = true;
            boolean foundOne =false;
    
            text = text.toLowerCase();
    
            while(stillLooking)
            {
                for(int i = 0; i < toFind.length(); i++)
                {// FOR EACH CHARACTER IN BALLOON
    
                    for(int j = 0; j < text.length(); j++)
                    {//CHECK AGAINST EACH CHARACTER IN THE STRING
    
                        if(!foundOne)
                        {
                            if(toFind.charAt(i) == text.charAt(j))
                            {
                                text = text.replaceFirst(text.charAt(j)+"", "-");
                                tracker++;
    
                            }
    
                            if(tracker == toFind.length())
                            {
                                tracker = 0;
                                howMany++;
                                foundOne = true;
                            }
                            else
                                stillLooking = false;
                        }
    
                    }
    
                    
                    
    
    
                }
            }
    
            return howMany;
            */
    
    
        }
    }
