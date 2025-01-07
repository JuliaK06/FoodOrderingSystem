 package bg.FoodOrderSmg.model;

public class PaymentStatus {
    private long id;
    private String name;

    public PaymentStatus() {
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public PaymentStatus(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
