public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) 
    {
        /* 
            check licensePlate against 'words', looking for the shortest word that uses ALL the letters

            get an array of all the letter characters in licensePlate
            run the array against each word checking how many characters dont match

            the issue Im running into with characters not being accounted for each time the show up is easily solved with a hashmap

        */

        HashMap <Integer, Character> validCharacters = new HashMap<Integer, Character>();
        int currentInd = 0;
        int closestIndex = 0;
        int currentSimilarity = 0;
        int closestSimilarity = 0;

        //MAP VALID CHARACTERS 
        for(int i = 0; i < licensePlate.length(); i++)
        {
            if(Character.isLetter(licensePlate.charAt(i)))
            {
                validCharacters.put(currentInd, Character.toLowerCase(licensePlate.charAt(i)));
                currentInd++;

            }

        }
        
        currentInd = 0;

        //Check each key against each word tracking which word is most similar
        for(int currentWordIndex = 0; currentWordIndex < words.length; currentWordIndex++)
        {   
            String currentWord = words[currentWordIndex];

            currentSimilarity = 0;
           
            for(Map.Entry<Integer, Character> entry: validCharacters.entrySet()) 
            {
                
                if(currentWord.contains(entry.getValue()+""))
                {
                    currentWord = currentWord.replaceFirst(entry.getValue()+"", "0");
                    currentSimilarity++;

                }

           }

           if(currentSimilarity > closestSimilarity 
                || (currentSimilarity == closestSimilarity && words[closestIndex].length() > words[currentWordIndex].length()))
                {

                    closestSimilarity = currentSimilarity;
                    closestIndex = currentWordIndex;

                }


        }


        return words[closestIndex];

        

    }



        /*

        ArrayList<Character> validCharacters = new ArrayList<Character>();
        int msSimilarity = 0, 
            msInd = 0, 
            currentSimilarity = 0;
        String currentWord;

        for(int i = 0; i < licensePlate.length(); i++)
        {

            if(Character.isLetter(licensePlate.charAt(i)))
            {
                validCharacters.add(Character.toLowerCase(licensePlate.charAt(i)));

            }
            

        }

        for(int currentWordIndex = words.length-1; currentWordIndex >= 0; currentWordIndex--)
        {
            currentSimilarity = 0;
            currentWord = words[currentWordIndex];

            for(int j = 0; j < validCharacters.size(); j++)
            {
                if(currentWord.contains(validCharacters.get(j)+""))
                {
                    currentSimilarity++;
                    currentWord.replaceFirst(validCharacters.get(j)+"", "0");

                }

            }

            if(currentSimilarity >= msSimilarity)
            {
                msSimilarity = currentSimilarity;
                msInd = currentWordIndex;

            }


        }

        return words[msInd];

    }
    */

}








