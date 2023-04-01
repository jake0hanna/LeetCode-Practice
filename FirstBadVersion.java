public class FirstBadVersion extends VersionControl {{
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public int firstBadVersion(int n) 
    {
        int highestKnownGood = 0;
        int lowestKnownBad = n;
        int mid = highestKnownGood + (lowestKnownBad - highestKnownGood) / 2;
 
        // I WOULD HAVE LOVED TO DO THIS ONE BEFORE THE GENERIC BINARY SEARCH ONE,
        // IT WOULD HAVE BEEN AN AWESOME WAY TO FIGURE THAT OUT



        //If we find a bad we know everything higher is bad
        //Similarly if we find a good we know everything lower is good
        //The space between is unknown and has to be squished down efficiently
        //once we find one it should be come the baseline from which we operate

        //if we find a bad we should then again take half of that number and continue checking

        //if we find a good we should find a number that is the middle point between the highestKnownGood and the lowestKnownBad


        while(highestKnownGood != lowestKnownBad -1)
        {
            //mid = 

            if(isBadVersion(mid))
            {
                
                lowestKnownBad = mid;


            }
            else
            {

                highestKnownGood = mid;
            }

            mid = highestKnownGood + (lowestKnownBad - highestKnownGood) / 2;


        }

        return lowestKnownBad;

    }

}

}
