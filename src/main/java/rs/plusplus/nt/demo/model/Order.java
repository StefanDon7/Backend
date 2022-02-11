package rs.plusplus.nt.demo.model;

import java.util.Date;
import java.util.Objects;

public class Order {
    private int orderID;
    private Product product;
    private ProductSupplier supplier;
    private Date date;

    public Order(int orderID, Product product, ProductSupplier supplier, Date date) {
        this.orderID = orderID;
        this.product = product;
        this.supplier = supplier;
        this.date = date;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(ProductSupplier supplier) {
        this.supplier = supplier;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID && Objects.equals(product, order.product) && Objects.equals(supplier, order.supplier) && Objects.equals(date, order.date);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", product=" + product +
                ", supplier=" + supplier +
                ", date=" + date +
                '}';
    }
}
