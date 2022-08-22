package com.doc.exception;

import org.apache.commons.lang3.StringUtils;

public class ExceptionUtility {

    private ExceptionUtility() {
    }

    public static String cartErrorMessage(boolean status) {
        return status ? "Medicine Details not found for this orderId" : "Order Id is not found";
    }

    public static String invoiceErrorMessage(String orderId) {
        return StringUtils.isEmpty(orderId) ? "Transaction Id is not available" : "Transaction Id is available";
    }
}
