package com.sidgs.dao;



import com.sidgs.model.Service;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Manoj on 2/23/2017.
 */

@Repository
public class ServiceDaoImpl implements ServiceDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addService(Service service) {
        sessionFactory.getCurrentSession().saveOrUpdate(service);

    }

    @SuppressWarnings("unchecked")
    public List<Service> getAllServices() {

        return sessionFactory.getCurrentSession().createQuery("from Service")
                .list();
    }

    @Override
    public void deleteService(Integer serviceId) {
        Service service = (Service) sessionFactory.getCurrentSession().load(
                Service.class, serviceId);
        if (null != service) {
            this.sessionFactory.getCurrentSession().delete(service);
        }

    }

    public Service getService(int serviceid) {
        return (Service) sessionFactory.getCurrentSession().get(
                Service.class, serviceid);
    }

    @Override
    public Service updateService(Service service) {
        sessionFactory.getCurrentSession().update(service);
        return service;
    }

}
