package com.fantasy.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import com.fantasy.beans.TestBean;
import com.fantasy.db.model.Elfs;

@Named(value = "blogEntryBean")
@RequestScoped
public class Producer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    TestBean bean;

    private List<Elfs> beans;

    @Produces
    @Named
    public List<Elfs> getBeans() {
        return beans;
    }

    public void setBeans(List<Elfs> beans) {
        this.beans = beans;
    }

    @PostConstruct
    public void retrieveAllSeatsOrderedByName() {
        beans = bean.query();


    }
}
