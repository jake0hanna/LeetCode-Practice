public class EmailAddressParsing {

        public int numUniqueEmails(String[] emails) 
        {
    
            // '.' = nothing
            // '+' ignores everything after
    
            /*
    
                one method would be parsing the emails based on the rules provided and then comparing
                
    
            */
    
            Set<String> parsedEmails = new HashSet<>();
            
            String[] tempSubstrings;
            String tss;
    
            for(int i = 0; i < emails.length; i++)
            {
                tempSubstrings = emails[i].split("@");
    
                tss = tempSubstrings[0];
                
                if((tss.indexOf("+") != -1))
                {
                  tss = tss.substring(0, tss.indexOf("+"));
    
                }
                
                tss = tss.replaceAll("\\.", "");
    
                tss = tss+"@"+tempSubstrings[1];
    
                parsedEmails.add(tss);
               
    
    
            }
            
            return parsedEmails.size();
    
            
        }
    
    }
    
    
    
    
    
    
    
    
    
    