package com.doc.controller;

import com.doc.constants.ServiceConstants;
import com.doc.exception.CartNotFoundException;
import com.doc.model.DocumentDetails;
import com.doc.model.UploadRequest;
import com.doc.repository.DocumentDetailsRepository;
import com.doc.responseutils.Response;
import com.doc.service.application.ApplicationFormService;
import com.doc.service.invoice.InvoiceGenerationService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import static com.doc.responseutils.ResponseHandler.*;

@RestController
@RequestMapping(path = "/document", produces = {"application/json"})
public class DocumentServiceController {

    private final Logger logger = LoggerFactory.getLogger(DocumentServiceController.class);

    @Autowired
    private InvoiceGenerationService invoiceGenerationService;

    @Autowired
    private ApplicationFormService applicationFormService;

    @Autowired
    private DocumentDetailsRepository documentDetailsRepository;

    @GetMapping("/invoice/{id}")
    public Response<?> generateInvoice(@PathVariable("id") String transactionId) throws CartNotFoundException {
        if (StringUtils.isEmpty(transactionId)) {
            return failure("Invalid Request");
        }
        logger.info("Fetching details for the transactionId: {}", transactionId);
        String invoiceAsString = invoiceGenerationService.getInvoiceAsString(transactionId);
        logger.info("Successfully generated PDF for transactionId: {}", transactionId);
        if (StringUtils.isEmpty(invoiceAsString)) {
            return failure(invoiceAsString);
        }
        return success(invoiceAsString, "PDF Generated Successfully");
    }

    @PostMapping("/updateDocumentDetails")
    public String updateDocumentDetails(@RequestBody UploadRequest uploadRequest){
        try{
            DocumentDetails documentDetails = new DocumentDetails();
            documentDetails.setDocumentName(uploadRequest.getFileName());
            documentDetails.setDocumentType(uploadRequest.getFileType());
            documentDetails.setBase64String(uploadRequest.getBase64String());
            documentDetails.setTransactionId(uploadRequest.getTransactionId());

            documentDetailsRepository.save(documentDetails);
            return ServiceConstants.SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
        }
        return ServiceConstants.FAILURE;
    }

    @GetMapping("/pdf")
    public String generatePdf() {
        return applicationFormService.getApplicationFormPDFAsString("202202020220");
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Server is running";
    }


}
