package com.doc.repository;

import com.doc.model.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends MongoRepository<Invoice, String> {

    List<Invoice> findByUserName(String userName);

    Invoice findByTransactionId(String transactionId);

    Invoice findByOrderId(String orderId);
}
