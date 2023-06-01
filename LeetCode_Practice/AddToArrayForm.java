package LeetCode_Practice;

public import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        StringBuilder converting = new StringBuilder();

        for (int i = 0; i < num.length; i++) 
        {
            converting.append(num[i]);
        }

        BigInteger convertedInt = new BigInteger(converting.toString());

        convertedInt = convertedInt.add(BigInteger.valueOf(k));

        String convert = convertedInt.toString();

        List<Integer> arrayForm = new ArrayList<>();

        for (char c : convert.toCharArray()) 
        {
            arrayForm.add(c - '0');
        }

        return arrayForm;
    }
}