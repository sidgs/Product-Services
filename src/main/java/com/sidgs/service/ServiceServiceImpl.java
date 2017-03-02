package com.sidgs.service;

import com.sidgs.dao.ServiceDao;
import com.sidgs.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by Shylaja on 2/24/2017.
 */


@org.springframework.stereotype.Service
@Transactional
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceDao serviceDao;

    @Override
    @Transactional
    public void addService(com.sidgs.model.Service service) {
        serviceDao.addService(service);
    }

    @Override
    @Transactional
    public List getAllServices() {
        return serviceDao.getAllServices();
    }

    @Override
    @Transactional
    public void deleteService(Integer serviceId) {
        serviceDao.deleteService(serviceId);
    }

    public Service  getService(int serviceId) {
        return serviceDao.getService(serviceId);
    }

    public Service updateService(Service service) {
        // TODO Auto-generated method stub
        return serviceDao.updateService(service);
    }

    public void setServiceDao(ServiceDao serviceDao) {
        this.serviceDao = serviceDao;
    }

}


