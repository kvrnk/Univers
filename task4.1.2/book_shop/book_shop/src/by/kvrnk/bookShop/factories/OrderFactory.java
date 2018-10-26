package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.order.Order;
import by.kvrnk.bookshop.generalobjects.order.OrderStates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderFactory {

    private static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public static List<Order> getOrderList(String[] signatures) {
        List<Order> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildOrderFrom(signature));
        }

        return result;
    }

    private static Order buildOrderFrom(String signature) {
        String[] values = signature.split(";");

        int id = Integer.parseInt(values[0]);
        Date entranceDate = null;
        Date completeDate = null;

        try {
            entranceDate = format.parse(values[1]);
            completeDate = format.parse(values[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        OrderStates state = OrderStates.valueOf(values[3]);

        return new Order(id, entranceDate, completeDate, state);
    }
}
