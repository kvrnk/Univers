package by.kvrnk.bookShop.sortings.sortingsObjects;

import by.kvrnk.bookShop.generalObjects.IGeneralObject;
import by.kvrnk.bookShop.sortings.components.ISorting;

import java.util.ArrayList;

public class SortingMachine {
    private ISorting sorting;

    public SortingMachine(ISorting sorting) {
        this.sorting = sorting;
    }

    public ArrayList<IGeneralObject> sort(ArrayList<IGeneralObject> objects) {
        return this.sorting.sort(objects);
    }
}
