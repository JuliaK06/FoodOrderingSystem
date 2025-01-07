package bg.FoodOrderSmg.model;

public class Status {
    private long id;
    private String name;

    public Status() {
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Status(long id, String name) {
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
