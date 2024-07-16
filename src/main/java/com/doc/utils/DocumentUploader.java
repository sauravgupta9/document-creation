package com.doc.utils;

import com.doc.constants.ServiceConstants;
import com.doc.model.DocumentUploaderResponse;
import com.doc.model.UploadRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class DocumentUploader {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${urlDetails.documentUploadUrl}")
    private String documentUploadUrl;

    public String uploadDocument(UploadRequest request) {
        String result = ServiceConstants.FAILURE;
        try {
            DocumentUploaderResponse documentUploaderResponse = restTemplate.postForObject(documentUploadUrl, request, DocumentUploaderResponse.class);
            if (Objects.nonNull(documentUploaderResponse) &&
                    ServiceConstants.SUCCESS.equalsIgnoreCase(documentUploaderResponse.getResult()))
                result = ServiceConstants.SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
