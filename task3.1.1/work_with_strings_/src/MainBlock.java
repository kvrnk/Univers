import by.kvrnk.modules.Converter;
import by.kvrnk.modules.Numbers;

public class MainBlock {
    public static void main(String[] args) {
        String[] line = {"5", "45", "76", "234","9","37"};
        Numbers numbers = new Numbers();
        Converter converter = new Converter();

        String str = Integer.toString(numbers.countingSum(converter.convertingInt(line)));

        System.out.println(str);
    }
}
