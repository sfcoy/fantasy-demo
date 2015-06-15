package com.fantasy.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.fantasy.db.model.Elfs;

/**
 * @author sfcoy
 */
@Stateless
public class TestBean {

    @PersistenceContext(unitName = "JPADB")
    private EntityManager em;

    public List<Elfs> query() {
        TypedQuery<Elfs> query = em.createQuery("SELECT e FROM Elfs e", Elfs.class);
        return  query.getResultList();
    }
}
