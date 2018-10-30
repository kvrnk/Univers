package by.kvrnk.bookshop.sortings;

import by.kvrnk.bookshop.generalobjects.order.Order;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderSorting {
    public List<Order> byPublicationDate(List<Order> objects) {
        Collections.sort(objects, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                return o1.getCompleteDate().compareTo(o2.getCompleteDate());
            }
        });
        return objects;
    }

    public List<Order> byState(List<Order> objects) {
        Collections.sort(objects, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                return o1.getState().compareTo(o2.getState());
            }
        });
        return objects;
    }

    public List<Order> byPrice(List<Order> objects) {
        Collections.sort(objects, new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                return Float.valueOf(o1.getCost()).compareTo(Float.valueOf(o2.getCost()));
            }
        });
        return objects;
    }

}
