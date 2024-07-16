package com.doc.service.invoice;

import com.doc.exception.CartNotFoundException;

public interface InvoiceGenerationService {

    String getInvoiceAsString(String transactionId) throws CartNotFoundException;
}
