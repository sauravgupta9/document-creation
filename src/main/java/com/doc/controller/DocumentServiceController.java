package com.doc.controller;

import com.doc.responseutils.Response;
import com.doc.service.invoice.InvoiceGenerationService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import static com.doc.responseutils.ResponseHandler.*;

@RestController
public class DocumentServiceController {

    private final Logger logger = LoggerFactory.getLogger(DocumentServiceController.class);

    @Autowired
    private InvoiceGenerationService invoiceGenerationService;

    @GetMapping("/invoice/{id}")
    public Response<?> generateInvoice(@PathVariable("{id}") String transactionId) {
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
}
