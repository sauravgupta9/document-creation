package com.doc.model;

import java.util.List;

public class DocumentUploaderResponse {
    private String result;
    private List<String> errorMessages;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public String toString() {
        return "DocumentUploaderResponse{" +
                "result='" + result + '\'' +
                ", errorMessages=" + errorMessages +
                '}';
    }
}
