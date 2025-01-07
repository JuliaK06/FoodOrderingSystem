package bg.FoodOrderSmg.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductsInOrder {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private Product product;

    private Order order ;

    private int quantity;

    public ProductsInOrder() {
    }

    public ProductsInOrder(long id, Product product, Order order, int quantity) {
        this.id = id;
        this.product = product;
        this.order = order;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductsInOrder{" +
                "id=" + id +
                ", product=" + product +
                ", order=" + order +
                ", quantity=" + quantity +
                '}';
    }
}
