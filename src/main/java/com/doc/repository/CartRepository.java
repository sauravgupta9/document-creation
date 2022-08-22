package com.doc.repository;

import com.doc.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

    List<Cart> findByUserName(String userName);

    Cart findByOrderId(String orderId);
}
