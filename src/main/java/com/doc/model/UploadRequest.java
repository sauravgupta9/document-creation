package com.doc.model;

public class UploadRequest {
    private String base64String;
    private String fileName;
    private String transactionId;
    private String fileType;
    private String bucketName;

    public String getBase64String() {
        return base64String;
    }

    public void setBase64String(String base64String) {
        this.base64String = base64String;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public String toString() {
        return "UploadRequest{" +
                "base64String='" + base64String + '\'' +
                ", fileName='" + fileName + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", fileType='" + fileType + '\'' +
                ", bucketName='" + bucketName + '\'' +
                '}';
    }
}
