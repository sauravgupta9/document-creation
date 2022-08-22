package com.doc.model;

public class MedicineOrder {

    private String medicineName;
    private String currentPrice;
    private String discount;
    private int quantity;

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MedicineOrder{" +
                "medicineName=" + medicineName +
                ", currentPrice='" + currentPrice + '\'' +
                ", discount='" + discount + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
