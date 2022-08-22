package com.doc.exception;

import com.doc.responseutils.Error;
import com.doc.responseutils.Response;
import com.doc.responseutils.ResponseHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class DocumentExceptionHandler {

    @ExceptionHandler(CartNotFoundException.class)
    public Response<?> handleCartNotFoundException(CartNotFoundException cartNotFoundException) {
        String orderId = cartNotFoundException.getOrderId();
        String transactionId = cartNotFoundException.getTransactionId();

        Map<String, String> map = new HashMap<>();
        map.put(StringUtils.isEmpty(orderId) ? "Transaction Id is not available" : "Transaction Id is available", transactionId);
        map.put(cartNotFoundException.isOrderIdExists() ? "Medicine Details not found for this orderId" : "Order Id is not found", orderId);

        Error error = new Error();
        error.setErrors(Collections.singletonList(map));
        error.setHttpStatus(HttpStatus.NOT_FOUND);
        error.setResult("Failed");

        return ResponseHandler.failure(null, List.of(error));
    }
}
