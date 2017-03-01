package com.sidgs.dao;

import com.sidgs.model.Provider;

import java.util.List;

/**
 * Created by Shylaja on 3/1/2017.
 */
public interface ProviderDao {
    public void addProvider(Provider provider);

    public List<Provider> getAllProviders();

    public void deleteProvider(Integer providerId);

    public Provider updateProvider(Provider provider);

    public Provider getProvider(int providerId);

}
