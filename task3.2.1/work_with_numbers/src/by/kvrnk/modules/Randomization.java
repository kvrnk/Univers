package by.kvrnk.modules;

import java.util.Random;

public class Randomization {
    private Random random = new Random();

    public int generateThreeDigitNumber() {

       return (100 + random.nextInt(1000 - 100));
    }
}
