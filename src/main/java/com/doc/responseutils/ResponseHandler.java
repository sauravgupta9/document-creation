package com.doc.responseutils;


import java.util.List;

public class ResponseHandler {

    public static Response<?> success() {
        return new Response<>("", "Success");
    }

    public static Response<?> success(Object object) {
        return new Response<>(object, "Success");
    }

    public static Response<?> success(Object object, String successMessage) {
        return new Response<>(object, successMessage);
    }

    public static Response<?> failure() {
        return new Response<>("", "Failed");
    }

    public static Response<?> failure(Object object) {
        return new Response<>(object, "Failed");
    }

    public static Response<?> failure(Object object, List<Error> errorMessages) {
        return new Response<>(object, "Failed", errorMessages);
    }
}
