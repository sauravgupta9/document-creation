package com.doc.responseutils;

import org.springframework.http.HttpStatus;

import java.util.List;

public class Error {
    private HttpStatus httpStatus;
    private String result;
    private List<Object> errors;

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "Error{" +
                "httpStatus=" + httpStatus +
                ", result='" + result + '\'' +
                ", errors=" + errors +
                '}';
    }
}
