package com.sidgs.service;


import com.sidgs.model.Service;

import java.util.List;

/**
 * Created by Manoj on 2/24/2017.
 */
public interface ServiceService {

    public void addService (Service service);
    public List<Service> getAllServices();
    public void deleteService(Integer serviceId);
    public Service getService(int serviceId);
    public Service updateService (Service service);



}
