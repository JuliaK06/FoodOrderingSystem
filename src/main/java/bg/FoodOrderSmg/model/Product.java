package bg.FoodOrderSmg.model;

public class Product {
private long id;
private Category status;
private double price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", status=" + status +
                ", price=" + price +
                '}';
    }

    public Product(long id, Category status, double price) {
        this.id = id;
        this.status = status;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getStatus() {
        return status;
    }

    public void setStatus(Category status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
