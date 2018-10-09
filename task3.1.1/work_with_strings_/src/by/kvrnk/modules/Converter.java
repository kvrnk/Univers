package by.kvrnk.modules;

public class Converter {

    public int[] convertingInt(String[] line) {
        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        return numbers;
    }
}
