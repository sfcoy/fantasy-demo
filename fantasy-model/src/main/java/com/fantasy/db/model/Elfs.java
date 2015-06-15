package com.fantasy.db.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author sfcoy
 */
@Entity
public class Elfs implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    protected Elfs() {
    }

    public Elfs(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elfs elfs = (Elfs) o;
        return Objects.equals(name, elfs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
