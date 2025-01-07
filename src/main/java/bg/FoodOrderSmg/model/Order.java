package bg.FoodOrderSmg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "orders")
public class Order {

    private long id;
    @Column(name = "users")
    private User user;
    @Column(name = "status")
    private Status status;
    @Column(name = "paymentStatus")
    private PaymentStatus paymentStatus;
    @Column(name = "total_price")
    private double total_price;


    private List<ProductsInOrder> listofProducts;

    @Column(name = "deliveryAddress")
    private String deliveryAddress;


    public Order() {
        listofProducts=new ArrayList<ProductsInOrder>();
    }

    public Order(long id, User user, Status status, PaymentStatus paymentStatus, double total_price, PaymentStatus payment, List<ProductsInOrder> listofProducts, String deliveryAddress) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.paymentStatus = paymentStatus;
        this.total_price = total_price;
        this.payment = payment;
        this.listofProducts = listofProducts;
        this.deliveryAddress = deliveryAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public PaymentStatus getPayment() {
        return payment;
    }

    public void setPayment(PaymentStatus payment) {
        this.payment = payment;
    }

    public List<ProductsInOrder> getListofProducts() {
        return listofProducts;
    }

    public void setListofProducts(List<ProductsInOrder> listofProducts) {
        this.listofProducts = listofProducts;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
