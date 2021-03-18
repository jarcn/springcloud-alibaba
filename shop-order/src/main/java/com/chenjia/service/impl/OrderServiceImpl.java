package com.chenjia.service.impl;

import com.chenjia.dao.OrderDao;
import com.chenjia.domain.Order;
import com.chenjia.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }


}
