/**
 * Класс "Позиция товара"
 */
public class OrderItem {
    private String itemName; // Наименование товара
    private double price; // цена товара

    public OrderItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getPrice() {
        return this.price;
    }

    //информация о товаре
    public String displaceItem() {
        return "Товар: " + this.itemName + ", Цена: " + this.price;
    }
}