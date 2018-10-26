package by.kvrnk.bookshop.textworkers;

import com.senla.training.TextFileWorker;

public class TextWorker {

    public static String[] readFromFile(String pathToFile) {
        return new TextFileWorker(pathToFile).readFromFile();
    }

    public static void writeToFile(String pathToFile, String[] values) {
        new TextFileWorker(pathToFile).writeToFile(values);
    }
}
