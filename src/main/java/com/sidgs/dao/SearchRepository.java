package com.sidgs.dao;

import com.sidgs.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.search.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.search.FullTextSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;

/**
 * Created by Vytlasai on 3/2/2017.
 */
@Repository
public class SearchRepository {

    @Autowired
    private SessionFactory sessionFactory;


//    @Transactional
    public List<Product> searchProduct(String searchText) throws Exception
    {
        try
        {
            Session session = sessionFactory.getCurrentSession();

            FullTextSession fullTextSession = Search.getFullTextSession(session);

            QueryBuilder qb = fullTextSession.getSearchFactory()
                    .buildQueryBuilder().forEntity(Product.class).get();
            org.apache.lucene.search.Query query = qb
                .keyword().onFields("description", "product_name", "product_style")
                .matching(searchText)
                .createQuery();

            org.hibernate.Query hibQuery =
                    fullTextSession.createFullTextQuery(query, Product.class);

            List<Product> results = hibQuery.list();
            return results;
        }
        catch(Exception e)
        {
            throw e;
        }
    }
}
