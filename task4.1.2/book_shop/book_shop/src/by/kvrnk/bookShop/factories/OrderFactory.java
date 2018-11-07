package by.kvrnk.bookshop.factories;

import by.kvrnk.bookshop.generalobjects.order.Order;
import by.kvrnk.bookshop.generalobjects.order.OrderStates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderFactory {
    private final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public List<Order> getOrderList(String[] signatures) {
        List<Order> result = new ArrayList<>();

        for (String signature : signatures) {
            result.add(buildOrderFrom(signature));
        }

        return result;
    }

    private Order buildOrderFrom(String signature) {

        try {
            String[] values = signature.split(";");
            Order order = new Order();
            order.setId(Integer.parseInt(values[0]));
            order.setEntranceDate(format.parse(values[1]));
            order.setCompleteDate(format.parse(values[2]));
            order.setState(OrderStates.valueOf(values[3]));

            return order;

        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }
    }
}
