import by.kvrnk.modules.Converter;
import by.kvrnk.modules.Randomization;
import by.kvrnk.modules.SearchEngine;

public class MainBlock {

    public static void main(String[] args) {
        Randomization randomization = new Randomization();
        Converter converter = new Converter();
        SearchEngine searchEngine = new SearchEngine();

        int number = randomization.generateThreeDigitNumber();
        int max = searchEngine.maxNumber(converter.toArrayList((Integer.toString(number).toCharArray())));

        System.out.println(number + "; " + max);

    }
}
