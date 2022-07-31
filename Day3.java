public class Day3 {
    
    public int[] TwoSum2(int[] numbers, int targetValue)
    {
        int[] result = new int[2];
        int firstPointer = 0;
        int lastPointer = numbers.length-1;

        while(firstPointer < lastPointer)
        {
            if((numbers[firstPointer]+numbers[lastPointer])<targetValue)
            {
                firstPointer++;
            }
            else if ((numbers[firstPointer]+numbers[lastPointer])>targetValue)
            {
                lastPointer--;
            }
            else
            {
                result[0]=firstPointer+1;
                result[1]=lastPointer+1;
                break;
            }
        }

        return result;
    }
}
