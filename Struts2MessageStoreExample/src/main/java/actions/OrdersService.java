package actions;

import java.util.*;

public class OrdersService {

    private static Map<String,Order> orders = new HashMap<String,Order>();
    private static int nextId = 6;
    static {
        orders.put("3", new Order("3", "Bob", 33));
        orders.put("4", new Order("4", "Sarah", 44));
        orders.put("5", new Order("5", "Jim", 66));
    }

    public Order get(String id) {
        return orders.get(id);
    }

    public List<Order> getAll() {
        return new ArrayList<Order>(orders.values());
    }

    /**
     * This method will save new orders and will update the existing ones (based on idorder)
     * @param order
     */
    public void save(Order order) {
        if (order.getIdorder() == null || order.getIdorder().trim().length()==0) {
            order.setIdorder(String.valueOf(nextId++));
        }
        orders.put(order.getIdorder(), order);
    }

    public void remove(String id) {
        orders.remove(id);
    }

}
