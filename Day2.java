import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Day2 {

    // Given a non-empty array of integers nums, every element appears twice except 
    //for one. Find that single one.

    public int FindElementNotRepeatedTwiceMethod1(int[] nums)
    {
        int numberNotRepeated = 0;
        
        for(int num: nums)
        {
            numberNotRepeated = numberNotRepeated^num;
        }
        return numberNotRepeated;

    }

    public int FindElementNotRepeatedTwiceMethod2(int[] nums)
    {
        int numberNotRepeated = 0;
        HashMap<Integer, Integer> listOfNumbers = new HashMap<Integer, Integer>();

        for(int num: nums)
        {
            if(listOfNumbers.containsKey(num))
            {
                listOfNumbers.put(num, listOfNumbers.get(num)+1);
            }
            else
            {
                listOfNumbers.put(num, 0);
            }
        }
        
        numberNotRepeated = Collections.min(listOfNumbers.entrySet(), Map.Entry.comparingByValue()).getKey();
   
        return numberNotRepeated;
    }
}
