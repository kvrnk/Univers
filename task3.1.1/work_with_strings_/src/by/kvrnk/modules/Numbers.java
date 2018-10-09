package by.kvrnk.modules;

public class Numbers {

    public int countingSum(int[] numbers) {
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
