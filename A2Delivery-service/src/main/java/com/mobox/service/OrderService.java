package com.mobox.service;
import com.mobox.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public interface OrderService {
    public List<Product> showAllFromDB();
}
