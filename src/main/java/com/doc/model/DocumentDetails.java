package com.doc.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "document-details")
public class DocumentDetails {

    private String documentName;
    private String documentType;
    @Id
    private String transactionId;
    private String base64String;

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getBase64String() {
        return base64String;
    }

    public void setBase64String(String base64String) {
        this.base64String = base64String;
    }

    @Override
    public String toString() {
        return "DocumentDetails{" +
                "documentName='" + documentName + '\'' +
                ", documentType='" + documentType + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", base64String='" + base64String + '\'' +
                '}';
    }
}
