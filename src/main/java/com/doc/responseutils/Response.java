package com.doc.responseutils;


import java.util.List;

public class Response<T> {

    private T response;
    private String result;
    private List<Error> errorMessages;

    public Response() {
        this(null,null,null);
    }

    public Response(T t) {
        this(t,null,null);
    }

    public Response(T t, String result) {
        this(t,result,null);
    }

    public Response(T t, String successMessage, List<Error> errorMessages) {
        this.response = t;
        this.result = successMessage;
        this.errorMessages = errorMessages;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Error>  getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<Error> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public String toString() {
        return "Response{" +
                "t=" + response +
                ", result='" + result + '\'' +
                ", errorMessages=" + errorMessages +
                '}';
    }
}
