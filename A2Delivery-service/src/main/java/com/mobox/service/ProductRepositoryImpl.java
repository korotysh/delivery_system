package com.mobox.service;

import com.mobox.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImpl {
    @Autowired
    Session session;

    public List<Product> getAll(){
        Query query = session.createQuery("from Product");
        List<Product> list = query.list();
        return list;
    }
}
