import by.kvrnk.modules.Converter;
import by.kvrnk.modules.Randomization;

import java.util.Collections;

public class MainBlock {

    public static void main(String[] args) {
        Randomization randomization = new Randomization();
        Converter converter = new Converter();

        int number = randomization.generateThreeDigitNumber();
        int max = Collections.max(converter.toArrayList((Integer.toString(number).toCharArray())));

        System.out.println(number + "; " + max);

    }
}
