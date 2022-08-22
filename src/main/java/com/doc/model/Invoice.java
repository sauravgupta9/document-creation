package com.doc.model;

import com.doc.model.enums.PaymentStatus;
import com.doc.model.enums.PaymentType;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDate;

@Document(collection = "invoice-collection")
public class Invoice {

    @Id
    private String userName;
    private String transactionId;
    private String orderId;
    private String totalPayableAmount;
    private String gstAmount;
    private LocalDate timeOfPayment;
    private PaymentStatus paymentStatus;
    private PaymentType paymentType;
    private boolean isGstRequired;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(String totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    public String getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(String gstAmount) {
        this.gstAmount = gstAmount;
    }

    public LocalDate getTimeOfPayment() {
        return timeOfPayment;
    }

    public void setTimeOfPayment(LocalDate timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public boolean isGstRequired() {
        return isGstRequired;
    }

    public void setGstRequired(boolean gstRequired) {
        isGstRequired = gstRequired;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "userName='" + userName + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", totalPayableAmount='" + totalPayableAmount + '\'' +
                ", gstAmount='" + gstAmount + '\'' +
                ", timeOfPayment=" + timeOfPayment +
                ", paymentStatus=" + paymentStatus +
                ", paymentType=" + paymentType +
                ", isGstRequired=" + isGstRequired +
                '}';
    }
}
