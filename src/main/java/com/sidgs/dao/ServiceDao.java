package com.sidgs.dao;




import com.sidgs.model.Service;

import java.util.List;

/**
 * Created by Manoj on 3/1/2017.
 */
public interface ServiceDao {
    public void addService(Service service);

    public List<Service> getAllServices();

    public void deleteService(Integer serviceId);

    public Service updateService(Service service);

    public Service getService(int serviceId);

}
