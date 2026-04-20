import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ===== FOOD ORDERS (Integer ID, Double Price) =====
        OrderRepository<Integer, Double> foodRepo = new OrderRepository<>();

        foodRepo.addOrder(new Order<>(1, 10.5, "Food"));
        foodRepo.addOrder(new Order<>(2, 20.0, "Food"));
        foodRepo.addOrder(new Order<>(3, 15.75, "Food"));

        // ===== ELECTRONICS ORDERS (String ID, Integer Price) =====
        OrderRepository<String, Integer> electronicRepo = new OrderRepository<>();

        electronicRepo.addOrder(new Order<>("A1", 500, "Electronics"));
        electronicRepo.addOrder(new Order<>("B2", 800, "Electronics"));
        electronicRepo.addOrder(new Order<>("C3", 650, "Electronics"));

        // ===== DISPLAY FOOD ORDERS =====
        System.out.println("=== Food Orders ===");
        for (Order<Integer, Double> order : foodRepo.getAllOrders()) {
            System.out.println(order);
        }

        double totalFood = OrderUtils.calculateTotal(foodRepo.getAllOrders());
        System.out.println("Total Food Price: " + totalFood);

        Order<Integer, Double> maxFood = OrderUtils.findMax(foodRepo.getAllOrders());
        System.out.println("Most Expensive Food Order: " + maxFood);

        System.out.println();

        // ===== DISPLAY ELECTRONICS ORDERS =====
        System.out.println("=== Electronics Orders ===");
        for (Order<String, Integer> order : electronicRepo.getAllOrders()) {
            System.out.println(order);
        }

        double totalElectronics = OrderUtils.calculateTotal(electronicRepo.getAllOrders());
        System.out.println("Total Electronics Price: " + totalElectronics);

        Order<String, Integer> maxElectronics = OrderUtils.findMax(electronicRepo.getAllOrders());
        System.out.println("Most Expensive Electronics Order: " + maxElectronics);
    }
}