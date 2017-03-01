package com.sidgs.service;



import com.sidgs.model.Provider;

import java.util.List;

/**
 * Created by Shylaja on 2/24/2017.
 */
public interface ProviderService {

    public void addProvider (Provider provider);
    public List<Provider> getAllProviders();
    public void deleteProvider(Integer providerId);
    public Provider getProvider(int providerId);
    public Provider updateProvider (Provider provider);



}
