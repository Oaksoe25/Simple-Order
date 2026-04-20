import java.util.*;

class OrderRepository<T, P extends Number> {
    private List<Order<T, P>> orders = new ArrayList<>();

    public void addOrder(Order<T, P> order) {
        orders.add(order);
    }

    public List<Order<T, P>> getAllOrders() {
        return orders;
    }
}