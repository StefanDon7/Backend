package rs.plusplus.nt.demo.model;

import java.util.Objects;

public class ProductSupplier {
    private int supplierID;
    private String supplierName;
    
    public ProductSupplier(int supplierID, String supplierName) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSupplier supplier = (ProductSupplier) o;
        return supplierID == supplier.supplierID && Objects.equals(supplierName, supplier.supplierName);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierID=" + supplierID +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}
