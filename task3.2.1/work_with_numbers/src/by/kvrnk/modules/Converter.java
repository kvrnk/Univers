package by.kvrnk.modules;
import java.util.ArrayList;

public class Converter {

    public ArrayList<Integer> toArrayList(char[] strChar) {
        ArrayList<Integer> strList = new ArrayList<Integer>();

        for(int i = 0; i < strChar.length; i++) {
            strList.add(Character.digit(strChar[i],10));
        }
        return strList;
    }
}
