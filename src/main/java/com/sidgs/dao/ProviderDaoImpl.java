package com.sidgs.dao;


import com.sidgs.model.Provider;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Shylaja on 2/23/2017.
 */

@Repository
public class ProviderDaoImpl implements ProviderDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addProvider(Provider provider) {
        sessionFactory.getCurrentSession().saveOrUpdate(provider);

    }

    @SuppressWarnings("unchecked")
    public List<Provider> getAllProviders() {

        return sessionFactory.getCurrentSession().createQuery("from Provider")
                .list();
    }

    @Override
    public void deleteProvider(Integer providerId) {
        Provider provider = (Provider) sessionFactory.getCurrentSession().load(
                Provider.class, providerId);
        if (null != provider) {
            this.sessionFactory.getCurrentSession().delete(provider);
        }

    }

    public Provider getProvider(int providerid) {
        return (Provider) sessionFactory.getCurrentSession().get(
                Provider.class, providerid);
    }

    @Override
    public Provider updateProvider(Provider provider) {
        sessionFactory.getCurrentSession().update(provider);
        return provider;
    }

}
