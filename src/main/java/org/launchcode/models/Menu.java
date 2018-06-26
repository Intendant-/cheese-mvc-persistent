package org.launchcode.models;

import  javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int Id;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses = new ArrayList<>();

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }


    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }
}
