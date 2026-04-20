import java.util.*;

class OrderUtils {

    // Calculate total price
    public static <T, P extends Number> double calculateTotal(List<Order<T, P>> orders) {
        double total = 0;

        for (Order<T, P> order : orders) {
            total += order.getPrice().doubleValue();
        }

        return total;
    }

    // Find most expensive order
    public static <T, P extends Number> Order<T, P> findMax(List<Order<T, P>> orders) {
        if (orders == null || orders.isEmpty()) {
            return null;
        }

        Order<T, P> maxOrder = orders.get(0);

        for (Order<T, P> order : orders) {
            if (order.getPrice().doubleValue() > maxOrder.getPrice().doubleValue()) {
                maxOrder = order;
            }
        }

        return maxOrder;
    }
}