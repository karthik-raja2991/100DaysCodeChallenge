public class MainClass {

    public static void main(String args[])
    {
        // Day 1 Example
        int[] price = {7,1,5,3,6,4};
        Day1 day1Code = new Day1();
        int profit = day1Code.BestTimeToBuyAndSellStock(price);
        System.out.println("The total profit that can be obtained is"+ " " + profit);
    }   
}
