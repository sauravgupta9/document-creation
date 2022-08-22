package com.doc.exception;

public class CartNotFoundException extends Exception {
    private String transactionId;
    private String orderId;
    private boolean orderIdExists;

    public CartNotFoundException(String transactionId, String orderId, boolean orderIdExists) {
        this.transactionId = transactionId;
        this.orderId = orderId;
        this.orderIdExists = orderIdExists;
    }

    public CartNotFoundException(String transactionId, String orderId) {
        this(transactionId, orderId, false);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isOrderIdExists() {
        return orderIdExists;
    }
}
