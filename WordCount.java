class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {

        HashMap<String, Integer> wordsCount = new HashMap<>();

        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        for(String s : paragraph.split("\\s+"))
        {
            wordsCount.put(s.toLowerCase(), wordsCount.getOrDefault(s.toLowerCase(), 0) + 1);

        }

        for(String s : banned)
        {
            wordsCount.remove(s.toLowerCase());

        }

        return Collections.max(wordsCount.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}