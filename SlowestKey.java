class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int currentLongestTime = releaseTimes[0]; // start with first key press
        char currentLongestKey = keysPressed.charAt(0);

        for(int i = 1; i < releaseTimes.length; i++) {

            int keyPressTime = releaseTimes[i] - releaseTimes[i - 1];

            if(keyPressTime > currentLongestTime 
            || (keyPressTime == currentLongestTime && keysPressed.charAt(i) > currentLongestKey)) 
            {
                currentLongestTime = keyPressTime;
                currentLongestKey = keysPressed.charAt(i);
            }
        }

        return currentLongestKey;
    }
}
