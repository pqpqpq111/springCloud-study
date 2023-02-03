package com.study.springcloud.service;


import com.study.springcloud.dao.PaymentDao;
import com.study.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return 1;
//        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return  new Payment();
//        return paymentDao.queryById(id);
    }
}