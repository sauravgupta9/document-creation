package com.doc.service.application;

import com.doc.constants.ServiceConstants;
import com.doc.mapper.ApplicationFormMapper;
import com.doc.model.UploadRequest;
import com.doc.utils.DocumentGenerator;
import com.doc.utils.DocumentUploader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service
public class ApplicationFormServiceImpl implements ApplicationFormService {

    private final Logger logger = LoggerFactory.getLogger(ApplicationFormServiceImpl.class);

    @Autowired
    private ApplicationFormMapper applicationFormMapper;
    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Autowired
    private DocumentUploader documentUploader;

    @Override
    public String getApplicationFormPDFAsString(String applicationNumber) {
        try {
            Context context = applicationFormMapper.setApplicationFormData();
            String processedHtml = springTemplateEngine.process("application", context);
            String pdfBase64 = DocumentGenerator.generatePdfBase64(processedHtml);
            return documentUploader.uploadDocument(getUploadRequest(applicationNumber, pdfBase64));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ServiceConstants.BLANK;
    }

    private UploadRequest getUploadRequest(String no, String data) {
        UploadRequest uploadRequest = new UploadRequest();
        uploadRequest.setBucketName("");
        uploadRequest.setBase64String(data);
        uploadRequest.setFileName("spring");
        uploadRequest.setFileType("pdf");
        uploadRequest.setTransactionId(no);
        return uploadRequest;
    }
}
