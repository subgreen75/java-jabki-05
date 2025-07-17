import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Система заказа:
 * Создайте класс Order с полями:
 * orderId (read-only, генерируется автоматически).
 * items (список товаров, private).
 * totalPrice (private, вычисляется при добавлении товара).
 * <p>
 * Добавьте методы для добавления товара и получения информации о заказе.
 */
public class Order {
    private final UUID orderID; // Идентификатор заказа (значение = глобальному идентификатору)
    private List<OrderItem> items = new ArrayList<OrderItem>(); // список товаров
    private double totalPrice; // Сумма по заказу

    public Order() {
        this.orderID = UUID.randomUUID();
    }

    /**
     * Метод добавляет товар в заказ
     * @param item товар
     */
    public void addItemToOrder(OrderItem item) {
        if (item.checkOrderItem(item.getItemName(), item.getPrice())) {
            this.items.add(item); // добавление товара в список товаров в заказе
            this.totalPrice += item.getPrice();  // цену товара добавлем к сумме по заказу
        }
    }

    public UUID getOrderID() {
        return this.orderID;
    }

    // информация о заказе
    public void displayOrderInfo() {
        System.out.println("Заказ (OrderID) = " + this.getOrderID());
        System.out.println("Сумма по заказу = " + this.totalPrice);
        System.out.println("Позиции товара:");
        for (OrderItem item : this.items) {
            System.out.println("\t" + item.displaceItem());
        }
    }
}