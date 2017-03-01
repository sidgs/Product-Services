package com.sidgs.service;


import com.sidgs.dao.ProviderDao;
import com.sidgs.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shylaja on 2/24/2017.
 */


@Service
@Transactional
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderDao providerDao;

    @Override
    @Transactional
    public void addProvider(Provider provider) {
        providerDao.addProvider(provider);
    }

    @Override
    @Transactional
    public List<Provider> getAllProviders() {
        return providerDao.getAllProviders();
    }

    @Override
    @Transactional
    public void deleteProvider(Integer providerId) {
        providerDao.deleteProvider(providerId);
    }

    public Provider getProvider(int providerId) {
        return providerDao.getProvider(providerId);
    }

    public Provider updateProvider(Provider provider) {
        // TODO Auto-generated method stub
        return providerDao.updateProvider(provider);
    }

    public void setProviderDao(ProviderDao providerDao) {
        this.providerDao = providerDao;
    }

}


