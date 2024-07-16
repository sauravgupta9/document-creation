package com.doc.service.invoice;

import com.doc.exception.CartNotFoundException;
import com.doc.model.Cart;
import com.doc.model.Invoice;
import com.doc.repository.CartRepository;
import com.doc.repository.InvoiceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class InvoiceGenerationServiceImpl implements InvoiceGenerationService {

    private final Logger logger = LoggerFactory.getLogger(InvoiceGenerationServiceImpl.class);

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private CartRepository cartRepository;

    @Override
    public String getInvoiceAsString(String transactionId) throws CartNotFoundException {
        try {
            Invoice invoice = getInvoiceDetails(transactionId);
            Cart cart = getCartDetails(transactionId, invoice.getOrderId());

        } catch (CartNotFoundException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Invoice getInvoiceDetails(String transactionId) throws CartNotFoundException {
        Invoice invoice = invoiceRepository.findByTransactionId(transactionId);
        if (isNull(invoice))
            throw new CartNotFoundException(transactionId, null);
        return invoice;
    }

    public Cart getCartDetails(String transactionId, String orderId) throws CartNotFoundException {
        Cart cart = cartRepository.findByOrderId(orderId);
        if (isNull(cart))
            throw new CartNotFoundException(transactionId, orderId);

        if (isNull(cart.getMedicineOrderList()) || (cart.getMedicineOrderList().size() == 0))
            throw new CartNotFoundException(transactionId, orderId, true);

        return cart;
    }
}