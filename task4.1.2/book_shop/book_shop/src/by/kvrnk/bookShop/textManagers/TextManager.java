package by.kvrnk.bookShop.textManagers;

import com.senla.training.TextFileWorker;

public class TextManager {

    public static String[] textToRead(String pathToFile) {
        TextFileWorker textFileWorker = new TextFileWorker(pathToFile);
        String[] strings = textFileWorker.readFromFile();
        return strings;
    }

}
