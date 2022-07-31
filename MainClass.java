public class MainClass {

    public static void main(String args[])
    {
        int[] price = {7,1,5,3,6,4};
        Day1 day1Code = new Day1();
        int profit = day1Code.BestTimeToBuyAndSellStock(price);
        System.out.println("The total profit that can be obtained is"+ " " + profit);

        Day2 day2Code = new Day2();
        int[] numbers = {4,1,2,1,2,5};
        int output = day2Code.FindElementNotRepeatedTwiceMethod2(numbers);
        System.out.println(output);

        Day3 day3Code = new Day3();
        int[] numbersForDay3= {2,7,11,15};
        int[] result = day3Code.TwoSum2(numbersForDay3, 9);
        System.out.println("The array results are"+result[0] +" "+"and"+" "+result[1]);
    }   
}
