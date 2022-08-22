package com.doc.model;

import com.doc.model.enums.OrderStatus;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "cart-details")
public class Cart {
    private List<MedicineOrder> medicineOrderList;
    private String userName;
    private String cartTotal;
    private String cartDiscount;
    @Id
    private String orderId;
    private Address address;
    private OrderStatus orderStatus;
    private String payableAmount;

    public List<MedicineOrder> getMedicineOrderList() {
        return medicineOrderList;
    }

    public void setMedicineOrderList(List<MedicineOrder> medicineOrderList) {
        this.medicineOrderList = medicineOrderList;
    }

    public String getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(String cartTotal) {
        this.cartTotal = cartTotal;
    }

    public String getCartDiscount() {
        return cartDiscount;
    }

    public void setCartDiscount(String cartDiscount) {
        this.cartDiscount = cartDiscount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "medicineOrderList=" + medicineOrderList +
                ", userName='" + userName + '\'' +
                ", cartTotal='" + cartTotal + '\'' +
                ", cartDiscount='" + cartDiscount + '\'' +
                ", orderId='" + orderId + '\'' +
                ", address=" + address +
                ", orderStatus=" + orderStatus +
                ", payableAmount='" + payableAmount + '\'' +
                '}';
    }
}
