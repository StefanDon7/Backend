package rs.plusplus.nt.demo.model;

import java.util.List;

public class Product {
    
    private int productID;
    private String productName;
    private int price;
    private List<ProductSupplier> list;



    public Product(int productID, String productName, int price, List<ProductSupplier> list) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.list = list;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<ProductSupplier> getList() {
        return list;
    }

    public void setList(List<ProductSupplier> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID;
    }



    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
